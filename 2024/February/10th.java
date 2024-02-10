class solution {
    public int countSubstrings(String s) {
        int leng = s.length();
        int ans = 0;
        boolean[][] palindrome = new boolean[leng][leng];

        for(int i = 0; i < leng; i++) {
            palindrome[i][i] = true;
            ans++;
        }

        for(int i = 0; i < leng - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                palindrome[i][i + 1] = true;
                ans++;
            }
        }

        for(int len = 3; len <= leng; len++) {
            for(int i = 0; i < leng - len + 1; i++) {
                if(s.charAt(i) == s.charAt(i + len - 1) && palindrome[i + 1][i + len - 2]) {
                    palindrome[i][i + len - 1] = true;
                    ans++;
                }
            }
        }

        return ans;
    }
}
