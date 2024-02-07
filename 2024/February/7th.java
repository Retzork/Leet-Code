class 7th {
    public String frequencySort(String s) {
        int[] counts = new int[26 * 2 + 10];
        
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                counts[26 + c - 'A']++;
            } else if (c >= '0' && c <= '9') {
                counts[26 * 2 + c - '0']++;
            }
        }
        
        List<Character> sortedChars = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            sortedChars.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            sortedChars.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            sortedChars.add(c);
        }
        
        Collections.sort(sortedChars, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int indexA;
                int indexB;
                if (Character.isLowerCase(a)) {
                    indexA = a - 'a';
                } else if (Character.isUpperCase(a)) {
                    indexA = 26 + a - 'A';
                } else {
                    indexA = 26 * 2 + a - '0';
                }
                if (Character.isLowerCase(b)) {
                    indexB = b - 'a';
                } else if (Character.isUpperCase(b)) {
                    indexB = 26 + b - 'A';
                } else {
                    indexB = 26 * 2 + b - '0';
                }
                return counts[indexB] - counts[indexA];
            }
        });
        
        StringBuilder result = new StringBuilder();
        for (char c : sortedChars) {
            int index;
            if (Character.isLowerCase(c)) {
                index = c - 'a';
            } else if (Character.isUpperCase(c)) {
                index = 26 + c - 'A';
            } else {
                index = 26 * 2 + c - '0';
            }
            int freq = counts[index];
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
