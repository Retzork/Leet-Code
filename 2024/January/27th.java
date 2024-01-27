class 27th {
    public int kInversePairs(int n, int k) {
        int mod = (int) 1e9 + 7;
        int[] dp = new int[k+1];
        int[] dpCurrent = new int[k+1];
        dp[0] = 1;

        for(int i = 0; i < n; i++){
            int total = 0;
            for (int j = 0; j < k + 1; j++) {
                total = (total + dp[j]) % mod;

                if (j > i) total = (total - dp[j-i-1] + mod) % mod;
                total %= mod;

                dpCurrent[j] = total;
            }
            System.arraycopy(dpCurrent, 0, dp, 0, k+1);
        }

        return dpCurrent[k];
    }
}
