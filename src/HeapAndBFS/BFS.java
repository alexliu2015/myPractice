package HeapAndBFS;

import BinaryTree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class BFS {
    public void printTreeLevelByLevel(TreeNode root){
        Deque<TreeNode> generate = new LinkedList<>();
        generate.add(root);
        while (!generate.isEmpty()){
            int n = generate.size();
            for(int i = 0; i < n; i++){
                TreeNode temp = generate.pollFirst();
                System.out.print(temp.val + " ");
                if(temp.left != null) generate.addLast(temp.left);
                if(temp.right != null) generate.addLast(temp.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        BFS b = new BFS();
        b.printTreeLevelByLevel(root);
    }
}
