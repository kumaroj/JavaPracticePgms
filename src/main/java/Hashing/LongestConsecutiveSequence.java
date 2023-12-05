package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }

    public int longestconsecutivesubsequence(List<Integer>ip){
        int maxlength = 0;
        int length = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        ip.forEach((x)->hs.add(x));
        for(int x :hs){
            if (!hs.contains(x-1)){

               /* while(hs.contains()){

                }*/
            }

        }



        return maxlength;
    }
}
