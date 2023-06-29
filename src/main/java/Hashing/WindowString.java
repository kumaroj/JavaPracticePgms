package Hashing;

import java.util.HashMap;

public class WindowString {
    public static void main(String[] args) {
        String A = "ADOBECODEBANC";
        String B = "ABC";
        String ans =  samllestWindow(A , B);
      //  generateAllSubstrings(A);
        System.out.println(ans);


    }

    public static String minWindow(String A, String B) {
        String ans = "";
        String minwindow = "";
        int match = 0;

        for (int i = 0; i<A.length(); i++) {
            String temp = "";
            for (int j = i; j < A.length(); j++) {
                temp += A.charAt(j);
                match = 0;
                for (int k = 0; k<B.length();k++){
                    for(int l = 0; l<temp.length(); l++){
                        if (temp.charAt(l) == B.charAt(k)){
                            match++;
                        }
                    }
                }
                if (match == B.length()) {
                    ans = temp;
                }
                if (minwindow.length() != 0) {
                    if (minwindow.length() > ans.length())
                        minwindow = ans;
                }
                else {
                    minwindow = ans;
                }

            }



        }
     return minwindow;

    }

    public static String samllestWindow(String s , String p) {
        if (s.isEmpty() || p.isEmpty())
            return "";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int i = 0, j = 0, count = map.size();
        int left = 0, right = 0, min = s.length();
        boolean found = false;

        while (j < s.length()) {
            char endchar = s.charAt(j++);
            if (map.containsKey(endchar)) {
                map.put(endchar, map.get(endchar) - 1);
                if (map.get(endchar) == 0)
                    count -= 1;
            }
            if (count > 0)
                continue;

            while (count == 0) {
                char strchar = s.charAt(i++);
                if (map.containsKey(strchar)) {
                    map.put(strchar, map.get(strchar) + 1);
                    if (map.get(strchar) > 0)
                        count += 1;
                }
            }
            if ((j - i) < min) {
                left = i - 1;
                right = j;
                min = j - i;

                found = true;
            }
        }
        return !found ? "-1" : s.substring(left, right);
    }
}
