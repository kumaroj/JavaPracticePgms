package Strings;

public class Swapcharacters {

    public static void main(String[] args) {
       String op = swap("Welcome to Automation Testing");
        System.out.println(op);
    }

    public static String swap(String a ){
       // String op = "";
        StringBuilder sb = new StringBuilder(a);
        int i = 0;
        int j = sb.length()-1;

      while(i<=j){
          char temp = sb.charAt(i);
          sb.setCharAt(i, sb.charAt(j));
          sb.setCharAt(j , temp);
          i++;
          j--;
      }

        return sb.toString();
    }

}


