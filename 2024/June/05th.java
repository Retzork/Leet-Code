class Solution {
    public List<String> commonChars(String[] words) {
        int len = words.length;
        List<String> ans = new ArrayList<>();

        int[] minFreq = new int[26];
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }

        for (int i = 1; i < len; i++) {
            int[] charCount = new int[26];
            for (char c : words[i].toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], charCount[j]);
            }
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }

        return ans;
    }
}
