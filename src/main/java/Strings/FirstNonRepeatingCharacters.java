package Strings;

import java.util.HashMap;

public class FirstNonRepeatingCharacters {

    public static void main(String[] args) {

        String s = "Java articles are awesome";
        char ans = nonRepeatingCharacter(s);
        System.out.println(ans);

    }

    public  static char nonRepeatingCharacter(String s){

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i) , map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i) , 1);
        }

        map.keySet().stream().forEach(i->{if (map.get(i) ==1) System.out.println(i);
        });

       int j = 0;
      while(j<s.length()){
          if (map.get(s.charAt(j) )== 1)
              return s.charAt(j);
          j++;
      }

      return ' ';
    }
}
