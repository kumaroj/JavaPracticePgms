package Tree;

public class DistancebetweenNodesofBST {

   static class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    int distance = 0;
    public static void main(String[] args) {

        TreeNode  root = new TreeNode(21);
        root.left = new TreeNode(13);
        root.left.left = new TreeNode(12);
        root.left.left.left = new TreeNode(10);
        root.left.right = new TreeNode(18);
        root.right = new TreeNode(35);
        root.right.left = new TreeNode(27);
        root.right.right = new TreeNode(41);

        DistancebetweenNodesofBST distancenodes = new DistancebetweenNodesofBST();
        distancenodes.solve(root , 35 , 10);
        System.out.println(distancenodes.distance);


    }

    public void solve(TreeNode A, int B, int C) {

        if (B< A.val && C< A.val){
            int d1 = findDistance(A ,B);
            int d2 = findDistance(A ,C);
            distance = Math.abs(d2-d1);
        }
        else if (B> A.val && C> A.val){
            int d1 = 1 +findDistance(A ,B);
            int d2 = findDistance(A,C);
            distance = Math.abs(d2-d1);
        }
        else if (B<A.val && C>A.val){
            int d1 = findDistance(A ,B);
            int d2 = findDistance(A ,C);
            distance = d1 +d2;
        }
        else if (B>A.val && C<A.val){
            int d1 = findDistance(A ,B);
            int d2 = findDistance(A ,C);
            distance = d1 +d2;

        }

        else if (B == A.val){
            int d2 = findDistance(A ,C);
            distance = d2;
        }
        else if (C == A.val){
            int d1 = findDistance(A ,B);
            distance = d1;
        }

    }

    public int findDistance(TreeNode A , int k){

        if (A==null)
            return -1;

        if (A.val == k)
            return 0;

       int ld = findDistance(A.left , k);
       int rd = findDistance(A.right , k);

       if (ld>-1){
           return 1 + ld;
       }
       else if (rd>-1){

       }

        return 1 + rd;
    }

}
