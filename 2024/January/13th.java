class 13th {
    public int minSteps(String s, String t) {
        int[] counter = new int[26];
        int len = s.length();

        for (char c : s.toCharArray()){
            counter[c - 'a']++;
        }
        for (char c : t.toCharArray()){
            counter[c - 'a']--;
        }

        int sum = 0;
        for (int value : counter) {
            sum += Math.abs(value);
        }

        return sum/2;
    }
}
