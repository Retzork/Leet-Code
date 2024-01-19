class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++){
            dp[0][i] = matrix[0][i];
        }

        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                int top = dp[i-1][j], left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
                if(j != 0) left = dp[i-1][j-1];
                if(j != n-1) right = dp[i-1][j+1];

                int pick = Math.min(top, left);
                pick = Math.min(pick, right);
                dp[i][j] = pick + matrix[i][j];
            }
        }

        int minn = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(minn > dp[n-1][i]){
                minn = dp[n-1][i];
            }
        }

        return minn;
    }
}
