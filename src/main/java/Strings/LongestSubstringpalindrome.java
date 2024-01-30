package Strings;

public class LongestSubstringpalindrome {

    public static void main(String[] args) {
       String ans = longestsubstringPalindrome("abacab");
        System.out.println(ans);
    }

    public  static String longestsubstringPalindrome(String a){
        String palindrome = "";

        String temp = "";

        for (int i = 0; i<a.length(); i++){
            temp="";
            temp+= a.charAt(i);
            for (int j = i+1 ; j<a.length(); j++ ){
                temp+= a.charAt(j);
               if (isPalindrome(temp)){
                   palindrome= temp.length()>palindrome.length()?temp:palindrome;

               }
            }
        }

        return palindrome;
    }

    public  static boolean isPalindrome(String a){
        int i = 0;
        int j = a.length()-1;
        while(i<=j){
            if (a.charAt(i)!=a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }




    public static int[] expend(String s , int ci , int cj){
       int[]  arr = new int[2];
       int i = ci; int j = cj;

       while(i>0 && cj<s.length() && s.charAt(i) == s.charAt(j)){
            i++; j--;
       }
       arr[0] = i;
       arr[1] = j;
       return arr;
    }
}
