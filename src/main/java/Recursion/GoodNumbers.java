package Recursion;

public class GoodNumbers {
   static  int evencnt = 0;
   static  int primecnt = 0;
    public static void main(String[] args) {
        int n = 50;
        counteven();
        countprime();
        int ans =  goodString(50, 0);
        System.out.println(ans);

    }

    public static int goodString(int n , int idx){
        if (idx == n){
            return 1;
        }

        if (idx %2 ==0){
           long even = (evencnt* goodString(n ,idx+1));
           int reseven = (int)(even%100000007);
           return reseven;
        }


        long prime =(primecnt* goodString(n ,idx+1))%100000007;
        int resprime  = (int)(prime%100000007);
        return resprime;
    }
    public static void counteven(){
        //int cnt = 0;
        for (int i = 0 ; i<=9 ; i++){
            if (i%2 == 0)
                 evencnt++;
        }

    }

    public static void countprime(){
       // int cnt = 0;
        for (int i = 3 ; i<=9 ; i++){
           if (findPrime(i))
             primecnt++;
        }
        primecnt++;
    }

    public static boolean findPrime(int a){
        for (int i = 2; i<=a/2; i++){
            if (a%i==0)
                return false;
            else
                continue;
        }

        return true;
    }
}
