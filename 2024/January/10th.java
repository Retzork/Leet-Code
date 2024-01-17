/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {} *
 *     TreeNode(int val) { this.val = val; } *
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer, List<Integer>> adjacencyList;
    Set<Integer> visited = new HashSet<>();

    public int amountOfTime(TreeNode root, int start) {
        adjacencyList = new HashMap<>();
        convert(root);
        return recursion(start) - 1;
    }
    public void convert(TreeNode node){
        if (node.left != null) {
            adjacencyList.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.left.val);
            adjacencyList.computeIfAbsent(node.left.val, k -> new ArrayList<>()).add(node.val);
            convert(node.left);
        }
      
        if (node.right != null) {
            adjacencyList.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.right.val);
            adjacencyList.computeIfAbsent(node.right.val, k -> new ArrayList<>()).add(node.val);
            convert(node.right);
        }        
    }

    public int recursion(int key){
        if(visited.contains(key)) return 0;
        visited.add(key);

        int maxx = 0;
        for (int adj : adjacencyList.getOrDefault(key, Collections.emptyList())) {
            maxx = Math.max(maxx, recursion(adj));
        }

        return maxx + 1;
    }
}
