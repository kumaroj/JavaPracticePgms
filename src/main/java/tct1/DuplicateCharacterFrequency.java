package tct1;

import java.util.Arrays;

public class DuplicateCharacterFrequency {

    public static void main(String[] args) {
        characterFreq("testing");
    }

    public  static void characterFreq(String s){
        s = "automation testingz";
        s = s.replaceAll("\\s" , "");
        int count = 0;
        int[] arr = new int[26];

      //  int x = s.charAt(0) - 0;
        for (int i = 0; i<s.length(); i++){
           arr[s.charAt(i) - 97]++;
        }
        System.out.println(Arrays.toString(arr));
        int cnt = 97;
        for (int i = 0; i<=25; i++){
            if (arr[i]>0){
                char x = (char)(cnt+i);
                int freq = arr[i];
                System.out.println(x +"->"+freq);
            }
        }



    }


}
