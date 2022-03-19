public class S606 {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val);
        int mode = 0;
        if (root.left != null) mode = 1;
        if (root.right != null) mode = 2;
        if (mode > 0) {
            sb.append("(");
            dfs(root.left, sb);
            sb.append(")");
        }
        if (mode > 1) {
            sb.append("(");
            dfs(root.right, sb);
            sb.append(")");
        }
    }
}
