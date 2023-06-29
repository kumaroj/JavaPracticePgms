package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DeserializeBinaryTree {

    class TreeNode{
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
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(-1);
        list.add(-1);
        list.add(-1);
        list.add(-1);
        list.add(-1);
        list.add(6);
        list.add(-1);
        list.add(-1);

        DeserializeBinaryTree deserialize =  new DeserializeBinaryTree();
        deserialize.solve(list);



    }
    public  TreeNode solve(ArrayList<Integer> A) {

        TreeNode   root =  new TreeNode(A.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while(!queue.isEmpty()){

            TreeNode t =  queue.poll();

            if (A.get(i)!=-1){
                t.left = new TreeNode(A.get(i));
                queue.add(t.left);

            }
            i++;
            if (A.get(i)!=-1){
                t.right = new TreeNode(A.get(i));
                queue.add(t.right);

            }
            i++;

        }
        return root;

    }

}
