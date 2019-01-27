package BinaryTree;

//binary tree is the tree each node at most has two child TreeNode

public class BinaryTree {
    public static boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        return left.val == right.val && isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        System.out.println(isSymmetric(root));
    }
}
