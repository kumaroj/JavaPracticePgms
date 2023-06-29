package searching;

import java.util.Arrays;

public class LastandFirstIndx {
    public static void main(String[] args) {
        int[]A = {1, 9, 9, 9, 10 , 21};
        int B = 9;

       int []ans = solve(A , B);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[]A , int B){
       int[]ans = new int[2];

       int s = 0;
       int e = A.length -1 ;
       int mid = -1;

       while(s<=e){
          mid = (s+e)/2;

          if (A[mid]==B){
            int spos =  binarySearch(A , B , 0 , mid);
            int epos =  binarySearch(A , B , mid+1, A.length-1);

            if (spos != -1 && epos != -1){
                ans[0] = spos;
                ans[1] = epos;
            }
            else if (spos == -1 && epos == -1){
                ans[0] = mid;
                ans[1] = mid;
            }
            else if (spos == -1){
                ans[0] = mid;
                ans[1] = epos;
              }
            else{
                ans[0] = spos;
                ans[1] = mid;
            }
              break;
          }
       }
        return ans;
    }

    public static int binarySearch(int[] A , int B , int s , int e){

        int l = s;
        int h = e;
        int mid = -1;

        while(l<=h){

            mid = (l+h)/2;
            if (A[mid] == B){
                return mid;
            }
            else if (A[mid]>B){
                h = mid- 1;
            }
            else{
                l = mid+1;
            }
        }

        return -1;
    }
}
