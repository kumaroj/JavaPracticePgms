package tct1;

import java.util.HashSet;

public class SubArrayZeroSum {
    public static void main(String[] args) {
        int[] ip = {4, 2, 2, 1, 6};
        int ans = subArrayZeroSum(ip);
        System.out.println(ans);
    }

    public static int subArrayZeroSum(int[]ip){


       int []ps = new int[ip.length];
       HashSet<Integer>set = new HashSet<>();
       ps[0] = ip[0];
       for(int i = 1; i<ip.length; i++){
           ps[i] = ps[i-1]+ip[i];
       }

       for (int j = 0; j<ps.length; j++){
           if (set.add(ps[j]) == false)
               return 1;
       }

        return 0;
    }
}
