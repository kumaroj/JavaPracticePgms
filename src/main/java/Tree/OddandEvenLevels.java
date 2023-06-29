package Tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class OddandEvenLevels {


    static class  TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public  TreeNode(int val){
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
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

      OddandEvenLevels levediff = new OddandEvenLevels();
      int ans = levediff.solve(root);
      System.out.println(ans);

    }

    public int solve(TreeNode A) {
        int diff = -1;
        int level = 1;
        int oddsum = 0;
        int evensum = 0;
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.add(A);
      oddsum+=A.val;
      while(!queue.isEmpty()){

        int size =  queue.size();
        level++;
        for (int i = 0; i<size; i++){
            TreeNode t= queue.poll();

            if (t.left!=null){
                queue.add(t.left);
                if (level%2 == 0)
                    evensum = evensum + t.left.val ;
                else
                    oddsum = oddsum + t.left.val ;
            }

            if (t.right!=null){
                queue.add(t.right);
                if (level%2 == 0)
                    evensum = evensum +  t.right.val;
                else
                    oddsum = oddsum +  t.right.val;
            }
        }
      }
        diff = oddsum - evensum;
        return   diff;
    }
}
