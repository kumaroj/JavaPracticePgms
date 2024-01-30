package InterviewQuestions;

import java.util.HashMap;

public class CountCharacters {
    public static void main(String[] args) {

        String s = "SSSSSTTPPQ";
        //output - > 5S2T2P1Q

      HashMap<Character , Integer> map = new HashMap<Character , Integer>();
      for (int i = 0; i<s.length(); i++){
          if (map.containsKey(s.charAt(i)))
              map.put(s.charAt(i), map.get(s.charAt(i))+1);
          else
              map.put(s.charAt(i) , 1);
      }

      String op ="";

      for(char x : map.keySet()){
          op+=String.valueOf(map.get(x))+x;
      }
        System.out.println(op);

      countingcharactersinString(s);

    }

    public static void countingcharactersinString(String s){
        int i = 0;  int j = 0;
        int count = 0;
        String op = "";

        while(i<s.length() && j<s.length()){

            while(s.charAt(i) == s.charAt(j)){
                j++;
                count++;
            }
            op+=String.valueOf(count)+s.charAt(i);
            i = j;
           // j++;
            count = 0;

        }
        System.out.println(op);

    }
}
