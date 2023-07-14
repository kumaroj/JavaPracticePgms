package bactracking;


import java.util.ArrayList;

public class AllPermutations {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>>ans = new  ArrayList<ArrayList<Integer>>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        boolean freq[] =  new boolean[3];
        allPermutations(arrlist , new ArrayList<Integer>() , freq , ans );
        System.out.println(ans);

    }

    public static void allPermutations(ArrayList<Integer> A, ArrayList<Integer>ip ,boolean[]freq ,
                                ArrayList<ArrayList<Integer>>ans){
        if (ip.size() == A.size()){
            ans.add(new ArrayList<>(ip));
            return;
        }

        for(int i = 0; i<A.size(); i++){
            if (!freq[i]){
                ip.add(A.get(i));
                freq[i] = true;
                allPermutations(A , ip , freq , ans);
                ip.remove(ip.size()-1);
                freq[i] = false;
            }
        }

    }
}
