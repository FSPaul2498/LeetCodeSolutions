public class S700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (val == root.val) return root;
        return searchBST(val < root.val ? root.left : root.right, val);
    }
}
