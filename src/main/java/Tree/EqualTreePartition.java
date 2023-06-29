package Tree;

import java.util.HashSet;

public class EqualTreePartition {

    static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left=null;
        right=null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        EqualTreePartition partition = new EqualTreePartition();
         int ans = partition.solve(root);
        System.out.println(ans);
    }

    public int solve(TreeNode A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int totalsum = findSum(A , hs);
        totalsum = totalsum/2;
        if (hs.contains(totalsum))
           return 1;

        return 0;
    }

    public int findSum(TreeNode A , HashSet<Integer>set){

        if (A==null)
            return 0;
       int sumleft = findSum(A.left , set);
       int sumright =  findSum(A.right , set);
        set.add(A.val + sumleft + sumright);
       return A.val + sumleft + sumright;

    }
}
