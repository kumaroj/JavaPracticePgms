package sorting;

import java.util.Arrays;

public class SumtheDifference {
    public static void main(String[] args) {
        int []A = {5 , 4 , 2};
        int ans = solve(A);
        System.out.println(ans);
    }

    public static int solve(int[] A) {

        int diff = 0;
        long max = 0;
        long min = 0;
        Arrays.sort(A);

        for (int i = 0; i<A.length; i++){


            long x = (A[i] * (long)((pow(2 , i , 1000000007)%1000000007)))%1000000007;
            long y = (A[i] * (long)((pow(2 , A.length-1-i ,1000000007 )%1000000007)))%1000000007;

            max  = (max%1000000007 + x)%1000000007;
            min  = (min%1000000007 + y)%1000000007;
        }
        diff  = (int)(max -min);
        return diff;
    }

    public static long pow(int x , int y , int z){
        int res = 1; // Initialize result

        while (y > 0) {

            if ((y & 1) != 0)
                res = (res * x)%z;

            y = y / 2;
            x = x * x;
        }
        return res % z;


    }
}
