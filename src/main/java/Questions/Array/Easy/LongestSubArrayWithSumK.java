package Questions.Array.Easy;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[]arr  = {2,3,5,1,9};
        int k = 10;
        int ans = longestSubarrayWithSumK(arr ,k );
        System.out.println(ans);
    }

    public  static  int longestSubarrayWithSumK(int[]arr , int k){

        int maxlength = 0;
        int length = 0;
        int sum = 0;

        for (int i = 0; i< arr.length; i++){
            sum = 0;
            sum+=arr[i];
            for(int j = i+1; j<arr.length; j++){

                sum+=arr[j];
                if(sum == k){
                    length = j-i+1;
                    maxlength = Math.max(length , maxlength);
                }
            }
        }

        return  maxlength;
    }
}
