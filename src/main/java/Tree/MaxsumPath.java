package Tree;

import sun.reflect.generics.tree.Tree;

public class MaxsumPath {

    static class TreeNode{
        int val ;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            left = null;
            right = null;

        }
    }

    public static void main(String[] args) {
          TreeNode root = new TreeNode(-100);
          root.left =  new TreeNode(-200);
          root.left.left = new TreeNode(-300);
          root.left.right = new TreeNode(-400);

        MaxsumPath maxpath =  new MaxsumPath();
        int ans = maxpath.maxPathSum(root);
        System.out.println(ans);
    }

    public int maxPathSum(TreeNode A) {
        if (A == null)
            return Integer.MIN_VALUE;

        int lsum = maxPathSum(A.left);
        int rsum = maxPathSum(A.right);

        int rlsum = Math.max(0 ,lsum )  + A.val;
        int rrsum = Math.max(0 , rsum )+ A.val;
        int totalsum = Math.max(0 , lsum) + Math.max(0 , rsum )+ A.val;
        int maxsubtreesum = Math.max(lsum , rsum);
        int smaxsum = Math.max(maxsubtreesum , Math.max(rlsum , rrsum));
        int maxsum = Math.max(totalsum, Math.max(smaxsum , A.val));
        return maxsum;

    }
}
