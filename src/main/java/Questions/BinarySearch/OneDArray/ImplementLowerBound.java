package Questions.BinarySearch.OneDArray;

public class ImplementLowerBound {
    public static void main(String[] args) {
        int []arr = {3,5,8,15,19};
        int x = 9;

       int ans = findLowerBound(arr , x);
       System.out.println(ans);


    }

    public  static int findLowerBound(int[] arr , int target){
        int s = 0;
        int e = arr.length-1;
        int mid = 0;
        int idx = arr.length;
        while(s<=e){
            mid = (s+e)/2;
           if (arr[mid] >= target){
               idx = mid;
               e = mid -1;
           } else if (arr[mid]<target) {
               s = mid +1;
           }
        }
        return idx;
    }
}
