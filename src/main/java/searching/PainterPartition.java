package searching;

public class PainterPartition {
    public static void main(String[] args) {
        int A = 1;
        int B = 1000000;
        //int []C = { 185, 186, 938, 558, 655, 461, 441, 234, 902, 681};

        int[]C = {1000000, 1000000};

       int ans =  paint(A , B , C);
       System.out.println(ans);


    }

    public  static int paint(int A , int B , int[]C){

        long ans = -1;
        int max_elem = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i<C.length; i++){
            max_elem = Math.max(C[i] , max_elem);
            sum+=C[i];
        }

        long l = max_elem;
        long h = sum;
        long mid = 0;

        while(l<=h){
            mid = (l+h)/2;
            if (checkMin(mid , A , C )<=A){
                ans = mid;
                h = mid -1;
            }
            else
                l  = mid+1;
        }
        ans = (ans*B)%10000003;
        return (int)(ans);

    }

    public static int checkMin(long t , int A , int[]C){

        int painter = 1;
        int totalsum = 0;

        for (int i = 0; i<C.length; i++){
            int x = C[i];
            totalsum+=x;
            if (totalsum>t){
                totalsum = x;
                painter++;
            }
        }
        return painter;
    }
}
