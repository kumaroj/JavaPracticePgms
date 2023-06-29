package Hashing;
import  javafx.util.Pair;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class Colinearpoints {
    public static void main(String[] args) {
       int[]A = { 9, -9, 8, -7, -3};
       int[]B = { -9, 0, -10, 2, 4};
       int ans = solvemaxpoints(A , B);
        System.out.println(ans);
    }



    public static int solvemaxpoints(int[]A , int[]B){
        int cnt = 0;
        int maxcnt = Integer.MIN_VALUE;
        int mxfreq = 0;
        HashMap<Map<Pair,Pair> , Integer> map =   new HashMap<Map<Pair,Pair> , Integer>();

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int c = 0;

        for (int i = 0; i<A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                x1 = A[i];
                y1 = B[i];
                x2 = A[j];
                y2 = B[j];

                int l = (y2-y1);
                int s =  (x2-x1);
                int gcd = -1;
                if (l>s)
                   gcd = gcd (l , s);
                else
                    gcd =  gcd(s , l);

                Pair<Integer, Integer>    p1 = new Pair<Integer, Integer>(l/gcd ,s/gcd);

               int c1 = (y1*x2) - (y2*x1);
               int c2 = x2 -x1;
                if (c1>c2)
                    gcd = gcd (c1 , c2);
                else
                    gcd =  gcd(c2 , c1);

                Pair<Integer, Integer>  pc1 = new Pair<Integer, Integer>(c1/gcd ,c2/gcd);

                HashMap<Pair, Pair> m1 = new HashMap<Pair, Pair>();
                m1.put(p1, pc1);

                if (map.containsKey(m1)){
                    map.put(m1 , map.get(m1)+1);
                }
                else
                    map.put(m1 , 1);
            }
        }

        for (Map<Pair, Pair> m:map.keySet()){
            mxfreq = Math.max(map.get(m) , mxfreq);
        }
        maxcnt = (1+ (int)Math.sqrt(1 + 8*mxfreq))/2;

        return maxcnt;
    }

    public static int gcd(int a , int b){
        if (b == 0)
            return a;
        else
            return gcd(b, Math.abs(a - b));
    }

    //Brute Force Approach
    //y = mx+c
    //y1-y2 = m(x1-x2)
    //y- y1 = m(x-x1)
    public  static int solve(int[]A , int[]B){
        int cnt = 0;
        int maxcnt = Integer.MIN_VALUE;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int m = 0;
        int y = 0;
        int x = 0;

        for (int i = 0; i<A.length; i++){
            for (int j = i+1; j<A.length; j++){

                x1 = A[i];
                y1 = B[i];
                x2 = A[j];
                y2 = B[j];

                int l = (y2-y1);
                int s =  (x2-x1) ;
                if (s == 0)
                    m = 0;
                else
                    m = l/s;

                cnt = 0;
                for (int k = i+1; k<A.length; k++){
                    int lhs = B[k] - y1;
                    int rhs = m*(A[k] - x1);
                    if (lhs == rhs ){
                        cnt++;

                    }
                }
                maxcnt = Math.max(cnt , maxcnt);
            }
        }

        return maxcnt+1;
    }


}
