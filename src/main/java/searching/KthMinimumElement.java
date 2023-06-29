package searching;

public class KthMinimumElement {
    public static void main(String[] args) {
        int []A = {1 ,2,2,2,3,3,6,6,6,6,6,6,8};
        int kthmin =  solve(A , 5);
        System.out.println(kthmin);

    }

    public static int solve(int[]A , int k){
        int ans = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<A.length; i++){
            min = Math.min(A[i] , min);
            max = Math.max(A[i] , max);
        }

        int s = min;
        int e = max;
        int mid = -1;

        while(s<=e){
          mid = (s+e)/2;
         int elecnt = countElements(A , mid);
         if (elecnt>=k){
             e = mid -1;
             ans = mid;
         }
         else {
             s = mid+1;
         }
        }
        return ans;
    }

    public static  int countElements(int[]A , int a){
        int cnt = 0;

        for (int i = 0; i<A.length; i++){
            if (A[i]<=a)
                cnt++;
        }
        return cnt;
    }
}
