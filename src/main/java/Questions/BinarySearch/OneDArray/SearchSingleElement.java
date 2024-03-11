package Questions.BinarySearch.OneDArray;

public class SearchSingleElement {

    public static void main(String[] args) {
        int [] arr = {3,3,7,7,10,11,11};
       int ans = searchNumber(arr);
        System.out.println(ans);
    }

    public static int searchNumber(int []nums){

        int s = 0;
        int e = nums.length-1;
        int mid = 0;
        int ans = 0;
        int n = 0;

        while(s<=e){
            mid = (s+e)/2;
/*
            if ((nums[mid]!=nums[mid+1]) && (nums[mid]!=nums[mid-1])){
                ans = nums[mid];
                break;
            }*/
            n = mid-0+1;
            if (n%2==0){
                s = mid +1;
            }
            else if (n%2 !=0 && nums[mid]==nums[mid-1]){
                e = mid - 2;
            }
        }
        return  nums[mid];

    }
}
