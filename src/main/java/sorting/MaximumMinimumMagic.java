package sorting;

import java.util.Arrays;

public class MaximumMinimumMagic {

    public static void main(String[] args) {
        int [] a = {-98 , 54 ,-52, 15, 23, -97 , 12, -64 , 52 , 85};
        int[] ans = solve(a);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] A) {

        Arrays.sort(A);
        int n = A.length/2;

        int[]arr1 = new int[n];
        int[]arr2 = new int[n];
        int j = 0;

        int []B = new int[2];
        int min = 0;
        int max = 0;

        for (int i = 0; i<n; i++){
            arr1[j] = A[i];
            j++;
        }

        j = 0;

        for (int i = n; i<A.length; i++){
            arr2[j] = A[i];
            j++;
        }

        int i = 0; j = arr2.length-1;

        while(i<arr1.length && j>=0){
            max = (max +(Math.abs(arr2[j] - (arr1[i]))))%1000000007;
            i++;
            j--;
        }

        for (int k = 0; k<A.length-1; k = k+2){
            min = (min +(Math.abs(A[k+1] - (A[k]))))%1000000007;
        }
        B[0] = max;
        B[1] = min;

        return B;

    }
}
