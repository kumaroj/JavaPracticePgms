package searching;

public class AthMagicalnumber {
    public static void main(String[] args) {
        int A = 33488383;
        int B = 565;
        int C = 29473;
        int ans = solve(A , B , C);
        System.out.println(ans);
    }

    public  static int solve(int A , int B , int C){
        long ans = -1;
        long l = 1;
        long h = (A*Math.min(B, C));
        long mid = 0;
        long hcf = findingHcf(A , B);
        long lcm = findingLCM(B, C , hcf);

        while(l<=h){

            mid = (l+h)/2;

            long nums = countingInteger(mid, B, C, lcm);
            if (nums > A){
                //ans = mid;
                h = mid-1;
            }
            else
            {
                l = mid+1;
            }

        }

        return (int)l%1000000007;
    }

    public static long countingInteger(long h , int b , int c , long lcm ){
        long cnt = (h/b) + (h/c) - (h/lcm);
        return cnt;
    }

    public static long findingHcf(long a , long b) {

        if (b == 0L)
            return a;

        return findingHcf(b, a % b);
    }

    static long findingLCM(long a , long b , long hcf){
        long lcm = 0;
        lcm = (a*b)/hcf;
        return lcm;
    }
}
