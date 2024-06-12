class Solution {
    public void sortColors(int[] nums) {
        int nol = 0, satu = 0, n = nums.length;
        for(int num : nums) {
            if(num == 0) nol++;
            else if(num == 1) satu++;
        }  

        for(int i = 0; i < nol; ++i) {
            nums[i] = 0;
        }

        for(int i = nol; i < nol + satu; ++i) {
            nums[i] = 1;
        }

        for(int i = nol + satu; i < n; ++i) {
            nums[i] = 2;
        }
    }
}
