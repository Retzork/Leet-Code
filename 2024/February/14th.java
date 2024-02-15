class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[] = new int[nums.length];
        int p = 0;
        int n = 1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result[p] = nums[i];
                p += 2;
            }else{
                result[n]=nums[i];
                n += 2;
            }
        }
        return result;
    }
}
