package Binary_Search_Tree;

public class BinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helpFunction(nums, 0, nums.length - 1);
    }


    public TreeNode helpFunction(int[] nums, int start, int end) {

        if(start > end ) return null;

        // find the middle element to be the root
        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        // left subtree
        root.left = helpFunction(nums,start, mid -1);
        // right subtree
        root.right = helpFunction(nums, mid + 1, end);

        return root;
    }
}
