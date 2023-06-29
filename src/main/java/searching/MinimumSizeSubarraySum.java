package searching;

import java.util.HashMap;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int []A = {2,3,1,2,4,3};
        int k = 7;
       MinimumSizeSubarraySum minimumSizeSubarraySum= new MinimumSizeSubarraySum();
       int ans = minimumSizeSubarraySum.minSubArrayLen(k , A);
       // System.out.println(ans);

        HashMap map= new HashMap();
        map.put(101 , "Pawan");
        map.put(102, "kumar");
        map.put(102 , "Singh");

        System.out.println(map.get(null));
       // map.get(null);
    }
    public int minSubArrayLen(int target, int[] nums) {
        int l = 1;
        int h = nums.length;
        int mid = 0;
        int ans = 0;
        while(l<=h){
            mid = (l+h)/2;

            if (subarraySum(nums , mid)>=target){
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;

    }

    public int subarraySum(int [] A , int k){
        int sum = 0;
        int maxsum = -1;
        int n = A.length;

        for (int i = 0; i<k; i++){
            sum+=A[i];
        }
        maxsum = sum;

        for (int j = 1 ; j<=n-k; j++){
            sum = sum -A[j-1] + A[j+k-1];
            maxsum = Math.max(sum , maxsum);
        }
        return maxsum;
    }
}
