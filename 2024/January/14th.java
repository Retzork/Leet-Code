class solution {
    public boolean closeStrings(String word1, String word2) {
        int[] str1 = new int[26], str2 = new int[26];

        for (char ch : word1.toCharArray()) str1[ch - 'a']++;
        for (char ch : word2.toCharArray()) str2[ch - 'a']++;
        
        for (int i = 0; i < 26; i++){
            if ((str1[i] != 0) != (str2[i] != 0)) return false;
        }
        
        int temp;

        for (int i = 0; i < 26; i++){
            for (int j = i+1; j < 26; j++){
                if (str1[i] > str1[j]){
                    temp = str1[i];
                    str1[i] = str1[j];
                    str1[j] = temp;
                }
                if (str2[i] > str2[j]){
                    temp = str2[i];
                    str2[i] = str2[j];
                    str2[j] = temp;
                }
            }
        }

        for (int i = 0; i < 26; i++){
            if (str2[i] != str1[i]) return false;
        }

        return true;
    }
}
