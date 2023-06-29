package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class MaxAndMin {
    public static void main(String[] args) {
        int []A = {2,1,5,6,2,3};
        solve(A);
    }

    public static  int solve(int[]A ){
        int sum = 0;
        int []nsel = nearestSmallestElementleft(A);
        int []nser = nearestSmallestElementRight(A);

       int []ngel = nearestGreatestElementleft(A);
       int []nger = nearestgreatestElementRight(A);

        System.out.println(Arrays.toString(nsel));
        System.out.println("*******");
        System.out.println(Arrays.toString(nser));
        System.out.println("*******");
        System.out.println(Arrays.toString(ngel));
        System.out.println("*******");
        System.out.println(Arrays.toString(nger));
        return sum;
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
