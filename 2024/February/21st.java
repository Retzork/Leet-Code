class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        int ans = 0;

        for (int i = 31; i >= 0; i--) {
            int bit1 = (left >> i) & 1;
            int bit2 = (right >> i) & 1;
            
            if (bit1 != bit2) break;
            
            ans |= (bit1 << i);
        }

        return ans;
    }
}
