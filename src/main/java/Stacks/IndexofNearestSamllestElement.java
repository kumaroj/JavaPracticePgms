package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class IndexofNearestSamllestElement {

    public static void main(String[] args) {
        int []A = {2,1,5,6,2,3};
        int []ans = idxnearestSmallestElementleft(A);
        System.out.println(Arrays.toString(ans));
        System.out.println("*******");
        int []ansr = idxnearestSmallestElementright(A);
        System.out.println(Arrays.toString(ansr));
    }


    public static  int[] idxnearestSmallestElementleft(int[]A){
        int[]nseli = new int[A.length];
        nseli[0] = -1;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);

        for (int i = 1; i<A.length; i++){
            while(!stack.isEmpty() && A[stack.peek()]>= A[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                nseli[i] = -1;
            }
            else{
                nseli[i] = stack.peek();

            }
            stack.push(i);
        }

        return nseli;
    }

    public static  int[] idxnearestSmallestElementright(int[]A){
        int[]nseri = new int[A.length];
        nseri[A.length-1] = -1;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(A.length-1);

        for (int i = A.length-2; i>=0; i--){
            while(!stack.isEmpty() && A[stack.peek()]>= A[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                nseri[i] = -1;
            }
            else{
                nseri[i] = stack.peek();

            }
            stack.push(i);
        }

        return nseri;
    }
}
