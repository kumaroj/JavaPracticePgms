package tct1;

import java.util.Arrays;

public class EquilibriumIndexArray {

    public static void main(String[] args) {
        int[]A = {-7, 1, 5, 2, -4, 3, 0};;
        int  ans = equilibriumIndex(A , A.length);
        System.out.println(ans);
    }

    public static  int equilibriumIndex(int []arr , int n){


       int[]ps = new int[arr.length];
       int[]ss = new int[arr.length];

       ps[0] = arr[0];
       ss[arr.length-1] = arr[arr.length-1];

       for (int i = 1; i<arr.length; i++){
           ps[i] =ps[i-1] + arr[i];
           ss[arr.length-1-i] = ss[arr.length-i] +arr[arr.length-1-i];
       }


       for (int k = 0;k<arr.length; k++){
           if (ps[k] == ss[k])
               return k;
       }
        System.out.println(Arrays.toString(ps));
        System.out.println(Arrays.toString(ss));

        return -1;
    }
}
