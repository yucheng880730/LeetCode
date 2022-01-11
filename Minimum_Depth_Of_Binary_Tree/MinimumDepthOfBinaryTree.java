package Minimum_Depth_Of_Binary_Tree;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root){

        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        int l = minDepth(root.left);
        int r = minDepth(root.right);

        if(l == 0 || r == 0) {
            return l + r + 1;
        } else {
            return Math.min(l, r) + 1;
        }

    }

//    if(root == null) return 0;
//    if(root.left == null && root.right == null) return 1;
//
//    int min_Depth = (Math.min(minDepth(root.left), minDepth(root.right))) + 1;
//    return min_Depth;
}
