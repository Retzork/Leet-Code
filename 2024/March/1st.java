class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int index = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isWhitespace(s.charAt(i))) {
                index = i;
                break;
            }
        }

        return s.length() - index -1;
    }
}
