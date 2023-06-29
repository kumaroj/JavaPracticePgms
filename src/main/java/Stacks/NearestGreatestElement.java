package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreatestElement {
    public static void main(String[] args) {
        int []A = {2,1,5,6,2,3};
        int []ans = nearestGreatestElementleft(A);
        System.out.println(Arrays.toString(ans));

        System.out.println("******");
        int []ansr = nearestgreatestElementRight(A);
        System.out.println(Arrays.toString(ansr));
    }

    public static int[] nearestGreatestElementleft(int[]A){

        int[]nge = new int[A.length];
        Stack<Integer> stack = new Stack<Integer>();
        nge[0] = -1 ;
        stack.push(A[0]);

        for (int i = 1; i<A.length; i++){
            while(!stack.isEmpty() && stack.peek()<= A[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = stack.peek();

            }
            stack.push(A[i]);
        }

        return nge;
    }

    public static int[] nearestgreatestElementRight(int[]A){

        int []nger = new int[A.length];
        Stack<Integer>stack = new Stack<Integer>();
        nger[A.length-1] = -1;
        stack.push(A[A.length-1]);

        for(int i = A.length-2; i>=0 ; i--){
            while(!stack.isEmpty() && stack.peek()<= A[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                nger[i] = -1;
            }
            else{
                nger[i] = stack.peek();
            }
            stack.push(A[i]);
        }

        return nger;
    }
}
