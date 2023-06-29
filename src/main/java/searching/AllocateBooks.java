package searching;

public class AllocateBooks {
    public static void main(String[] args) {
        int []A = {73,58,30,72,44,78,23,9};
        int B = 5;

        int ans = books(A , B);
        System.out.println(ans);
    }

    public static int books(int[]A , int B){

        int ans = -1;
        int arrsum = 0;
        int minval = A[0];

        if (A.length<B)
            return -1;

        for(int i = 0; i<A.length; i++){
            arrsum+=A[i];
            minval = Math.min(minval , A[i]);
        }

        int l = minval;
        int h = arrsum;

        int mid = -1;
        while(l<=h){
            mid = (l+h)/2;
            if(SubarraySum(A, mid, B)){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid +1;
            }
        }

        return ans;
    }

    public static boolean SubarraySum(int [] A, int val , int B){

        int pages = 0;
        int student = 1;

        for (int i = 0; i<A.length; i++){
            if (A[i]>val)
                return false;
            if (pages + A[i]>val){
                student++;
                pages = 0;
                pages+=A[i];
            }

           else{
                pages+=A[i];
            }

        }

        if (student>B)
            return false;
        return true;

    }
}
