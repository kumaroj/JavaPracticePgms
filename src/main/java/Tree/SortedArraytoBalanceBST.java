package Tree;

import sun.reflect.generics.tree.Tree;

public class SortedArraytoBalanceBST {

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

    public static void main(String[] args) {
        //int []A = { 1, 2, 3, 4, 5};
        int []A = {1};
       SortedArraytoBalanceBST sortedArraytoBalanceBST = new SortedArraytoBalanceBST();
       sortedArraytoBalanceBST.sortedtoBST(A);
    }

    public  TreeNode sortedtoBST(final int []A){
        TreeNode root = null;
        root =  constructTree(A , 0 , A.length-1);
        return root;
    }

    public TreeNode constructTree(int[]A , int s , int e){
        if (s>e)
            return null;

        int mid = (s+e)/2;

        TreeNode root = new TreeNode(A[mid]);
        root.left = constructTree(A , s , mid-1);
        root.right = constructTree(A , mid+1 , e);
        return root;
    }

}
