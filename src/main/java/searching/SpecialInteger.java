package searching;

public class SpecialInteger {

    public static void main(String[] args) {
        //int []A = {5 , 17 , 100, 11};
        int []A = {1 , 2 ,3 , 4 , 5};
        int B = 10;

       int ans = solve(A , B);
       System.out.println(ans);

    }

    public static int solve(int[]A , int B){

        int ans = 0;
        int l = 0; int h = A.length-1;
        int m = 0;

        while(l<=h){

            m = (l+h)/2;
           if (maxSubarraySum(A , m)<=B){
               ans = m;
               l = m+1;
           }
           else {
               h = m-1;
           }
        }

        return ans;
    }

    public static int maxSubarraySum(int[]A , int k){
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i<k ; i++){
            sum+=A[i];
        }

        max_sum = Math.max(max_sum , sum);
        for (int i = 1 ; i<=A.length-k; i++){
            sum = (sum-A[i-1]) + A[i+k-1];
            max_sum = Math.max(sum , max_sum);
        }
        return max_sum;
    }
}
