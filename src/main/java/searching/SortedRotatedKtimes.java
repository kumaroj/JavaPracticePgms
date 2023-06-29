package searching;

public class SortedRotatedKtimes {
    public static void main(String[] args) {

        int []A = {11,14,19,23,27,-20,-14,-8,-4,1,2,4,7};
        int k = -8;
        int r = 5;

        int ans = findElement(A  ,k, r);
        System.out.println(ans);
    }

    public static int findElement(int[]A , int k, int r){

       int x = binarySearch(A , k , 0, r-1);
       if (x != -1)
           return x;
       int y = binarySearch(A , k , r, A.length-1);

        return y;
    }

    public static int binarySearch(int []A , int k , int s , int e){int l = s;

        int mid = 0;

        while(s<=e){
            mid = (s+e)/2;

            if (A[mid] == k){
                return mid;
            }
            else if (A[mid] >k){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
}
