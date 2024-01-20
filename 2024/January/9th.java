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
class 9th {
    List<Integer> leaf1 = new ArrayList<>();
    List<Integer> leaf2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        rec(root1, true);   
        rec(root2, false);   

        if (leaf1.size() != leaf2.size()) return false;
        
        for (int i = 0; i < leaf1.size(); i++) {
            if (!leaf1.get(i).equals(leaf2.get(i))) {
                return false;
            }
        }

        return true;
    }

    private void rec(TreeNode node, boolean isTheFirst){
        if(node == null) return;

        if (node.left == null && node.right == null) {
            if(isTheFirst){
                leaf1.add(node.val);
            }else{
                leaf2.add(node.val);
            }
        }

        rec(node.left, isTheFirst);
        rec(node.right, isTheFirst);
    }
}
