package Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if(root == null) return ans;

        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);

        System.out.println(ans);
        return ans;
    }
}
