package Recursion;

import java.util.ArrayList;
import java.util.List;


public class AllsubsequencesSum {
    static int cnt = 0;
    public static void main(String[] args) {
        int []arr = {1 , 2, 1};
        sumAllSubsequences(0, arr , new ArrayList<Integer>() ,0, 2);
        System.out.println(cnt);
    }

    public static void sumAllSubsequences(int idx , int []arr , List<Integer> al ,int sum,int k){

        if (idx>=arr.length){
            if (sum == k){
                cnt++;
                for(int x: al)
                    System.out.print(x);
                System.out.println();
            }
            return;
        }
        al.add(arr[idx]);
        sum+=arr[idx];
        sumAllSubsequences(idx+1, arr , al ,sum ,k);
        al.remove(al.size()-1);
        sum-=arr[idx];
        sumAllSubsequences(idx+1, arr , al, sum, k);
    }

}
