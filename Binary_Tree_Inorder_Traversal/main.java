package Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        e.left = g;
        e.right = h;

        c.left = f;

        f.right = i;

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        binaryTreeInorderTraversal.inorderTraversal(a);

    }
}
