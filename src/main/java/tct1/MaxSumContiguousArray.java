package tct1;

public class MaxSumContiguousArray {

    public static void main(String[] args) {
        int[]A = { -3, 1 , -8, 4, -1, 2, 1, -5, 5 };
        int ans = maxsumSubarray(A);
        System.out.println(ans);
    }

    public static int maxsumcontigousArray(int[]arr){

        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length; i++){
            sum=0;
            sum+=arr[i];
            for (int j = i+1 ; j<arr.length; j++){
                sum+=arr[j];
                max_sum=Math.max(sum , max_sum);
            }
        }

        return max_sum;
    }

    //optimized approach

    public  static  int maxsumSubarray(int []arr ){
        int max_sum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i<arr.length; i++){
            currsum+=arr[i];
            max_sum = Math.max(max_sum, currsum);
            if (currsum<0)
                currsum = 0;
        }
        return max_sum;
    }
}


