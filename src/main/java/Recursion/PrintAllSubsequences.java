package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

    public static void main(String[] args) {
        int[]arr = {3 , 1, 2};
        printAllSubsequences(0 , arr , new ArrayList<Integer>());
    }

    public static void printAllSubsequences(int idx , int []arr , List<Integer> al){

        if (idx>=arr.length){
            for(int x: al)
                System.out.print(x);
            System.out.println();
            return;
        }
        al.add(arr[idx]);
        printAllSubsequences(idx+1, arr , al);
        al.remove(al.size()-1);
        printAllSubsequences(idx+1, arr , al);
    }


}
