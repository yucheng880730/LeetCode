package Balanced_Binary_Tree;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {

        if(root == null) return true;

        // right tree height
        int right_high = treeHeight(root.right);
        // left tree height
        int left_high = treeHeight(root.left);

        // recursive
        if(Math.abs(right_high - left_high) > 1) {
            return false;
        } else {
            return isBalanced(root.right) && isBalanced(root.left);
        }
    }

    // function to get height of the tree
    public int treeHeight(TreeNode root) {

        if(root == null) return 0;
        return Math.max(treeHeight(root.right), treeHeight(root.left)) + 1;

    }
}
