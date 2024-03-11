package Questions.BinarySearch.OneDArray;

/*
Problem statement- If the value is present in the array, then return its index. Otherwise,
determine the index where it would be inserted in the array while maintaining the sorted order.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {

        int []arr = {1 , 2, 4, 7};
        int x = 6;
        int ans = searchPosition(arr, x);
        System.out.println(ans);
    }

    public static int searchPosition(int[]arr , int target){

        int idx = arr.length;
        int s = 0;
        int e = arr.length;
        int mid = 0;

        while(s<=e){
            mid = (s+e)/2;
            if (arr[mid] == target){
                idx = mid;
                return idx;
            }
            else if(arr[mid]>target){
                idx = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }

        }

        return idx;
    }
}
