package Questions.BinarySearch.OneDArray;

public class ImplementUpperBound {

    public static void main(String[] args) {
        int []arr = {3,5,8,9,15,19};
        int x = 9;
       int ans = findUpperBound(arr , x);
       System.out.println(ans);
    }

    public static int findUpperBound(int []arr , int x) {
        int idx = arr.length;
        int s = 0;
        int e = arr.length-1;
        int mid = 0;

        while (s <= e) {
            mid = (s+e)/2;
            if (arr[mid] == x) {
                s = mid + 1;
            } else if (arr[mid] > x) {
                idx = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return idx;

    }
}
