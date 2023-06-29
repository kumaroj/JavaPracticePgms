package searching;

public class FreqofElementSortedArray {

    public static void main(String[] args) {
        int []A = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,5,8,10,10,15};
        int k = 5;
        int idx = firstOccurance(A , 5);
        int lastidx = lastOccurance(A , 5);
        System.out.println(idx);
        System.out.println(lastidx);

        int freq = lastidx - idx +1;
        System.out.println(freq);

    }

    public static int firstOccurance(int []A , int k){
        int s = 0;
        int e = A.length;
        int mid = 0;
        int ans = -1;


        while(s<=e){
            mid = (s+e)/2 ;
            if (A[mid] == k){
                ans = mid;
                e = mid-1;
            }
            else if (A[mid]>k)
                e = mid-1;
            else
                s = mid+1;
        }
        return ans;
    }

    public static int lastOccurance(int []A , int k){
        int s = 0;
        int e = A.length;
        int mid = 0;
        int ans = -1;

        while(s<=e){
            mid = (s+e)/2 ;
            if (A[mid] == k){
                ans = mid;
                s = mid+1;
            }
            else if (A[mid]>k)
                e = mid-1;
            else
                s = mid+1;
        }
        return ans;
    }
}