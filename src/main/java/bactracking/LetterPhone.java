package bactracking;

import java.util.ArrayList;
import java.util.List;

public class LetterPhone {


    public static void main(String[] args) {
        String A = "23";
        ArrayList<String> ans = letterCombinations(A);
        System.out.println(ans);

    }
    public static  ArrayList<String> letterCombinations(String A) {


      ArrayList<String>ans  =  new ArrayList<String>();
      String[]charMap = {"0" , "1", "abc", "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "xyz"};
      StringBuilder curr = new StringBuilder();
      generateAllStrings( 0, A , curr , ans , charMap);

      return ans;
    }

    public static void generateAllStrings(int idx , String A , StringBuilder curr , List<String> ans , String[]charMap){

        if (curr.length() == A.length()){
            ans.add(curr.toString());
            return ;
        }
        int digitidx = A.charAt(idx) -'0';
        for (int i = 0; i<charMap[digitidx].length(); i++){
            curr.append(charMap[digitidx].charAt(i));
            generateAllStrings(idx+1 , A , curr , ans , charMap);
            curr.deleteCharAt(idx);
        }
    return;
    }
}
