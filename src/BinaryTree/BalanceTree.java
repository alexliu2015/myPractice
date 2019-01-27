package BinaryTree;

public class BalanceTree {
    public static boolean isBalanceTree(TreeNode root){
        //corner case check
        //if root == null
        if(root == null){
            return true;
        }

        //for general cases you have to have a measure to calculate length of left and length of right
        //abs(length(root.left) - length(root.right)) > 1 then false
        //else true
        if(Math.abs(length(root.left) - length(root.right)) > 1){
            return false;
        }
        return true;
    }



    public static int length(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftLen = length(root.left);
        int rightLen = length(root.right);
        return leftLen >= rightLen ? leftLen + 1 : rightLen + 1;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        System.out.println(isBalanceTree(root));
    }
}
