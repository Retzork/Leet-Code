/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// I started doing daily leetcode since the 12th of jan, and i can only buy 
// up to 3 time travel ticket in the leetcode store, so from 8th to later daily questions
// my streaks wont count, so it will appear as if i started from the 9th.
class Solution {
    int ans = 0, loww, highh;
    public int rangeSumBST(TreeNode root, int low, int high) {
        loww = low;
        highh = high;
        trav(root);
        return ans;
    }

    private void trav(TreeNode root) {
        if (root != null) {
            trav(root.left);
            if(root.val >= loww && root.val <= highh) ans += root.val;
            trav(root.right);
        }
    }
}
