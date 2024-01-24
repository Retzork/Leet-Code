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
class Solution {
    int ans = 0;
    Set<Integer> set = new HashSet<>();
    
    public int pseudoPalindromicPaths (TreeNode root) {
        rec(root);        
        return ans;
    }

    private void rec(TreeNode node) {
        if (node == null) return;
        add(node.val);

        if (node.left == null && node.right == null) {
            ans += set.size() < 2 ? 1 : 0;
        } else {
            rec(node.left);
            rec(node.right);
        }

        add(node.val);
    }

    private void add(int n){
        if (!set.remove(n)) set.add(n);
    }
}
