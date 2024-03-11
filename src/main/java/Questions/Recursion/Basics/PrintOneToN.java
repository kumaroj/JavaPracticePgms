package Questions.Recursion.Basics;

import java.util.Arrays;

public class PrintOneToN {
    public static void main(String[] args) {

        int [] arr = new int[5];
        int[]ans = printNumbers(5 , arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[]  printNumbers(int n , int[]arr){
        if (n == 0){
            return arr;
        }
        arr = printNumbers(n-1 , arr);
        arr[n-1] = n;
        return arr;


    }
}
