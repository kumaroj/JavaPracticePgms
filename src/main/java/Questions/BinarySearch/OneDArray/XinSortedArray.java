package Questions.BinarySearch.OneDArray;

public class XinSortedArray {

    public static void main(String[] args) {
        int []arr = {-1,0,3,5,9,12};
        int target = 9;
        int ans = findIndexOfElement(arr , target);
        System.out.println(ans);
    }

    public  static  int findIndexOfElement(int[]arr , int target){

        int s = 0;
        int e = arr.length-1;
        int mid = 0;

        while(s<=e){
            mid = (s+e)/2;
            if (arr[mid] == target)
               return mid;
            else if (arr[mid]<target) {
                s = mid +1;
            }
            else{
                e = mid -1;
            }
        }
        return -1;
    }
}
