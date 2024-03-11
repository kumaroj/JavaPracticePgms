package Questions.BinarySearch.OneDArray;

import java.util.Arrays;

/*
Problem Statement-
 Given a sorted array arr of n integers and a target value k. Write a program to find the indices of
 the first and the last occurrences of the target value.
 If the target is not found then return -1 as indices.
 */
public class FirstandLastOccurrances {
    public static void main(String[] args) {
        int[]arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 8;
        int[]ans = firstLastOccurance(arr , x);
        System.out.println(Arrays.toString(ans));

    }

    public static int [] firstLastOccurance(int[] nums , int target){
        int []ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int s = 0;
        int e = nums.length-1;
        int mid = 0;
        int lb = -1;
        int up = -1;

        if (nums.length == 0){
            return ans;
        }
        else if (nums[0]>target){
            return ans;
        }
        else if (nums.length == 1 && target == nums[0]){
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }
        else if (target>nums[nums.length-1]){
            return ans;
        }

        while(s<=e){
            mid = (s+e)/2;
            if (nums[mid]>=target){
                lb = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        if (nums[lb] != target){
            return ans;
        }
        else if (nums[lb] == target && nums[nums.length -1]==target ){
            ans[0] = lb;
            ans[1] = nums.length -1;
            return ans;
        }


        s = 0;
        e = nums.length -1;
        mid = 0;
        while(s<=e){
            mid = (s+e)/2;
            if (nums[mid]>target){
                up = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        ans[0] =lb;
        ans[1] = up-1;

        return ans;

    }
}
