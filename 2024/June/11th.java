class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int idx = 0, len1 = arr1.length;
        int[] ans = new int[len1];

        for(int a : arr2){
            for(int i = 0; i < len1; i++){
                if(a == arr1[i]){
                    ans[idx] = a;
                    arr1[i] = -1;
                    idx++;
                }
            }
        }

        Arrays.sort(arr1);

        for(int a : arr1){
            if(a != -1){
                ans[idx] = a;
                idx++;
            }
        }
        return ans;
    }
}
