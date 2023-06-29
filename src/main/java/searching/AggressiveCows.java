package searching;

import java.util.Arrays;

public class AggressiveCows {

    public static void main(String[] args) {

        int []A = {82, 61, 38, 88, 12, 7, 6, 12, 48, 8, 31, 90, 35, 5, 88, 2, 66, 19, 5, 96, 84, 95};
        int k = 8;

        int ans =  solve(A , k);
        System.out.println(ans);

    }

    public static int solve(int[]A , int k){

        int ans = -1;
        int n = A.length;

        Arrays.sort(A);

        int maxdist = A[n-1] - A[0];
        int mindist = A[1] - A[0];
        int mid = 0;


        int l = mindist;
        int h = maxdist;

        while(l<=h){

            mid = (l+h)/2;

            if (checkmin(mid , k , A)){
                ans = mid;
                l = mid+1;

            }
            else
                h = mid-1;
        }


        return ans;
    }





    public static boolean checkmin(int d , int k , int[]A){

        int lastposition = A[0] ;
        int cows = 1;
        for (int i = 1; i<A.length; i++){
            if ((A[i] - lastposition)>=d){
                lastposition = A[i];
                cows++;
                if (cows == k)
                    return true;
            }
        }


        return false;
    }

}
