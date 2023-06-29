package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class TreePostandInorder {


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    public static void main(String[] args) {

      int[] A = { 17, 12, 24, 13, 2, 22, 9, 20, 18, 23, 3, 15, 21, 10, 4, 11, 19, 14, 16, 7, 1, 5, 6, 8 };
      int[] B = { 17, 13, 2, 22, 24, 18, 20, 9, 15, 3, 11, 4, 10, 14, 16, 19, 1, 7, 21, 23, 12, 6, 8, 5 };


        ArrayList<Integer> A1 =  new ArrayList<Integer>( 17);
        ArrayList<Integer> B1 =  new ArrayList<Integer>();

        A1.add(17);
        A1.add(12);
        A1.add(24);
        A1.add(13);
        A1.add(2);
        A1.add(22);
        A1.add(9);
        A1.add(20);
        A1.add(18);
        A1.add(23);
        A1.add(3);
        A1.add(15);
        A1.add(21);
        A1.add(10);
        A1.add(4);
        A1.add(11);
        A1.add(19);
        A1.add(14);
        A1.add(16);
        A1.add(7);
        A1.add(1);
        A1.add(5);
        A1.add(6);
        A1.add(8);

        B1.add(17);
        B1.add(13);
        B1.add(2);
        B1.add(22);
        B1.add(24);
        B1.add(18);
        B1.add(20);
        B1.add(9);
        B1.add(15);
        B1.add(3);
        B1.add(11);
        B1.add(4);
        B1.add(10);
        B1.add(14);
        B1.add(16);
        B1.add(19);
        B1.add(1);
        B1.add(7);
        B1.add(21);
        B1.add(23);
        B1.add(12);
        B1.add(6);
        B1.add(8);
        B1.add(5);

        TreePostandInorder  treePostandInorder=  new TreePostandInorder();
        treePostandInorder.buildTree(A1 , B1);
    }

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {

        for(int i = 0 ; i<A.size() ;i++){
            hmap.put(A.get(i) , i);
        }
        return  buildtree(A,B,0,A.size()-1,0 , B.size()-1);
    }

    public TreeNode buildtree(ArrayList<Integer> A, ArrayList<Integer> B , int sin , int ein , int spos , int epos){

        if(spos>epos)
            return null;


        TreeNode node = new TreeNode(B.get(epos));

        int idx = hmap.get(B.get(epos));
        // int idx = rps - 1;
        int sizelst = idx-sin;

        node.left = buildtree(A , B , sin, idx-1 , spos ,(spos + sizelst)-1 );
        node.right = buildtree(A , B , idx+1 , ein ,spos + sizelst ,epos-1);

        return node;
    }


}
