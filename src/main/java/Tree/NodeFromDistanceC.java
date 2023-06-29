package Tree;

import java.util.ArrayList;

public class NodeFromDistanceC {

    static class TreeNode{
        int val ;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }

    ArrayList<Integer> al =  new ArrayList<Integer>();

    public static void main(String[] args) {

       TreeNode root = new TreeNode(91);
       root.left = new TreeNode(91);
       root.right = new TreeNode(21);
       root.left.left = new TreeNode(2);
       root.left.right = new TreeNode(24);
       root.left.left.left = new TreeNode(78);
       root.left.left.right = new TreeNode(55);

       root.right.left = new TreeNode(46);
       root.right.right = new TreeNode(51);

        NodeFromDistanceC distanec = new NodeFromDistanceC();
        distanec.solve(root , 46 , 1);
        System.out.println(distanec.al);
    }


    public ArrayList<Integer> solve(TreeNode A, int B, int C) {

        int keydist = distanceFromRoot(A , B);
        distancefromNode(A ,A , keydist , C);

        return al;


    }

    public int distanceFromRoot(TreeNode root , int key){
        if (root == null)
            return -1;

        int dist = -1;

        if ((root.val == key)||
                (dist = distanceFromRoot(root.left, key)) >= 0 ||
                (dist = distanceFromRoot(root.right, key)) >= 0)
            return dist + 1;

        return dist;
    }


    public void distancefromNode(TreeNode root , TreeNode A ,  int keydist , int c){

        if (A == null)
            return;

        int x = distanceFromRoot(root , A.val);
        if (Math.abs(keydist - x)  == c){
            al.add(root.val);
        }

        distancefromNode(root ,A.left , keydist , c);
        distancefromNode(root, A.right, keydist , c);
    }
}
