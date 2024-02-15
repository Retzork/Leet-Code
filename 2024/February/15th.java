class Solution {
    public long largestPerimeter(int[] nums) {
        long sum = 0;
        Arrays.sort(nums);

        for (int i : nums) sum += i;
        
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }

        return -1;
    }
}
