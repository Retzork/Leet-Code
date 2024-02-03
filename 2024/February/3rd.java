class 3rd {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j < 0) {
                    dp[i] = Math.max(dp[i], maxInArray(Arrays.copyOfRange(arr, 0, i + 1)) * (i + 1));
                } else {
                    dp[i] = Math.max(dp[i], dp[i - j] + maxInArray(Arrays.copyOfRange(arr, i - j + 1, i + 1)) * j);
                }
            }
        }

        return dp[n - 1];
    }
    private static int maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}
