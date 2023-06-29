package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElement {

    public static void main(String[] args) {
        int []A = {2,1,5,6,2,3 };
        int []ans = nearestSmallestElementleft(A);
        System.out.println(Arrays.toString(ans));
        System.out.println("*********");
        int []ansr = nearestSmallestElementRight(A);
        System.out.println(Arrays.toString(ansr));
    }

    public  static int[] nearestSmallestElementleft(int[]A){
       int[]nse = new int[A.length];
       nse[0] = -1;
       Stack<Integer> stack = new Stack<Integer>();
       stack.push(A[0]);

       for (int i = 1; i<A.length; i++){
           while(!stack.isEmpty() && stack.peek()>= A[i]){
               stack.pop();
           }
           if (stack.isEmpty()){
               nse[i] = -1;
           }
           else{
               nse[i] = stack.peek();

           }
           stack.push(A[i]);
       }
        return nse;
    }

    public static int[] nearestSmallestElementRight(int[]A){
       int [] nser = new int[A.length];
       Stack<Integer >stack = new Stack<Integer>();
       nser[A.length-1] = -1;
       stack.push(A[A.length-1]);

       for(int i = A.length-2; i>=0 ; i--){
           while(!stack.isEmpty() && stack.peek()>= A[i]){
               stack.pop();
           }
           if (stack.isEmpty()){
               nser[i] = -1;
           }
           else{
               nser[i] = stack.peek();

           }
           stack.push(A[i]);
       }


      return nser;
    }

}
