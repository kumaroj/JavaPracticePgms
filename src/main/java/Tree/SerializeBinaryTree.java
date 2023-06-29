package Tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBinaryTree {

    static class TreeNode {
        int val ;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        ArrayList<Integer> ans = solve(root);
        System.out.println(ans);

    }

    public static ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> serialize = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        while (!queue.isEmpty()) {
            TreeNode t = queue.poll();
            if (t != null) {
                serialize.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            } else {
                serialize.add(-1);
            }
        }
        return serialize;
    }

}
