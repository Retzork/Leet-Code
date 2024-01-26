class 26th {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] dp = new int[m+2][n+2];
        int[][] dpCurrent = new int[m+2][n+2];
        int mod = (int) 1e9 + 7;

        for(int t = 0; t < maxMove ; t++){
            for(int i = 0; i < m + 2; i++){
                for(int j = 0; j < n + 2; j++){
                    if(i == 0 || j == 0 || i == m + 1 || j == n + 1) dp[i][j] = 1;
                }
            }

            for(int i = 1; i < m + 1; i++){
                for(int j = 1; j < n + 1; j++){
                    dpCurrent[i][j] = dp[i - 1][j];
                    dpCurrent[i][j] += dp[i][j - 1];
                    dpCurrent[i][j] %= mod;
                    dpCurrent[i][j] += dp[i + 1][j];
                    dpCurrent[i][j] %= mod;
                    dpCurrent[i][j] += dp[i][j + 1];
                    dpCurrent[i][j] %= mod;
                }
            }
            for (int i = 0; i < m + 2; i++) {
                System.arraycopy(dpCurrent[i], 0, dp[i], 0, n + 2);
            }

        }

        return dp[startRow + 1][startColumn + 1];
    }
}
