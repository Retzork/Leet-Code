class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedArr = heights.clone();
        int ans = 0;
        
        Arrays.sort(sortedArr);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedArr[i]) {
                ans++;
            }
        }

        return ans;
    }
}
