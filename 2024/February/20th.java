class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] num = new boolean[n+1];

        for(int i : nums) num[i] = true;
        for(int i = 0; i <= n; i++) if(!num[i]) return i;

        return 0;
    }
}
