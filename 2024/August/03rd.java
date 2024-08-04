class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len = target.length;
        if(target.length != arr.length) return false;

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i = 0; i < len; i++){
            if(target[i] != arr[i]) return false;
        }

        return true;
    }
}
