class 11th {
    public int maxAncestorDiff(TreeNode root) {
        return rec(root, 0, (int) 10e5);
    }

    public int rec(TreeNode current, int maxx, int minn){
        if (current == null) { return maxx - minn; }

        int newMax = Math.max(maxx, current.val);
        int newMin = Math.min(minn, current.val);

        return Math.max(rec(current.left, newMax, newMin), rec(current.right, newMax, newMin));
    }
}
