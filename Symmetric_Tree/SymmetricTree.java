package Symmetric_Tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;

        else return dfs(root.left, root.right);

    }

    public boolean dfs(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        else if(p == null || q == null || p.val != q.val) return false;

        else return dfs(p.left, q.right) && dfs(p.right, q.left);
    }
}
