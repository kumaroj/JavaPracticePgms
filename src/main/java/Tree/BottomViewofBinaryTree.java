package Tree;

import java.util.*;

public class BottomViewofBinaryTree {

    static  class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


    class Pair{

       TreeNode t;
        int y;

        public Pair(TreeNode t , int y){
            this.t = t;
            this.y = y;

        }
    }
    Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
    ArrayList<Integer> topview = new ArrayList<Integer>();
    public static void main(String[] args) {
       TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        root.right.right.right = new TreeNode(9);

        BottomViewofBinaryTree bottomview  = new BottomViewofBinaryTree();
        bottomview.solve(root);

    }

    public ArrayList<Integer> solve(TreeNode A) {

        levelOrderTraversal(A);
        System.out.println(map);
        for(int x:map.keySet()){
            topview.add(map.get(x));
        }
        System.out.println(topview);
        return topview;
    }

    public void levelOrderTraversal(TreeNode A){
        Queue<Pair> queue =  new LinkedList();
        Pair p1 = new Pair(A , 0);
        queue.add(p1);

        while(!queue.isEmpty()){


            int x=  queue.size();
            for (int i = 0; i<x ; i++){
                Pair p = queue.poll();
                if (p.t.left!=null){
                    queue.add(new Pair(p.t.left , p.y-1));
                }
                if (p.t.right!=null){
                    queue.add(new Pair(p.t.right , p.y+1));
                }

                map.put(p.y , p.t.val);
//                if (map.containsKey(p.y)){
//                    map.put(p.y , p.t.val);
//                }
//                else{
//                    map.put(p.y , p.t.val);
//                }


            }
        }

    }
}
