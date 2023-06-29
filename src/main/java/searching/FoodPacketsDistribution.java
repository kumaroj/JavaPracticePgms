package searching;

public class FoodPacketsDistribution {

    public static void main(String[] args) {
        int[] A = {10000, 22000, 36000};
        int B = 6;
        int ans = solve(A, B);
        System.out.println(ans);
    }

    public static int solve(int[] A, int B) {


        int ans = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < A.length; i++) {
            min = Math.min(A[i], min);
            sum += A[i];
        }

        if (sum < B)
            return 0;

        int l = 1;
        int h = min;
        int mid = -1;
        while (l <= h) {

            mid = (l + h) / 2;
            if (checkmin(mid , A, B)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }


        }

        return ans;
    }

    public static boolean checkmin(int c ,int[]A , int B) {
        int d = 0;
        int pop = 0;
        for (int i = 0; i < A.length; i++) {

            d+=A[i]/c;
        }
        if(d>=B)
            return true;

        return false;
    }

}
