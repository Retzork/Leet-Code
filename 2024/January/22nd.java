class solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length, missing = 0, dupe = 0;
        int[] arr = new int[len + 1];

        for(int i = 0; i < len; i++){
            arr[nums[i]]++;
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 2) dupe = i;
            if(arr[i] == 0) missing = i;
        }

        return new int[] {dupe, missing};
    }
}
