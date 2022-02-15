package Binary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null) return ans;

        ans.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return ans;
    }
}
