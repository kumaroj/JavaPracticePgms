package searching;

public class FloorofNumber {
    public static void main(String[] args) {
        int[]A = {-5, 2, 3, 6, 9, 10, 11, 14, 18};
        int k = 10;
       int floor = floorNumber(A , k);
        System.out.println(floor);
    }

    public static int floorNumber(int[]A , int k){
        //-5, 2, 3, 6, 9, 10, 11, 14, 18
        int s = 0;
        int e = A.length;
        int mid = 0;
        int ans = Integer.MIN_VALUE;

        while(s<=e) {
            mid = (s+e)/2;
            if (A[mid] == k)
                return A[mid];
            else if (A[mid]>k){
                e = mid-1;
            }
            else if (A[mid]<k){
                ans = A[mid];
                s = mid+1;
            }

        }

        return ans;
    }
}
