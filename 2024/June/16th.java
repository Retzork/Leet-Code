class Solution {
    public int minPatches(int[] nums, int n) {
        long small = 1;
        int ans = 0;
        int i = 0;

        while(small <= n){
            if(i < nums.length && nums[i] <= small){
                small += nums[i];
                i++;
            }else{
                small += small;
                ans++;
            }
        }

        return ans;
    }
}
