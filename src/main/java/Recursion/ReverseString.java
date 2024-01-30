package Recursion;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        String ip = scan.nextLine();
       String rev = reverseString(ip , ip.length()-1);
        System.out.println(rev);
    }

    public static String reverseString(String s , int j){
        if (j<0)
            return "";

            return s.charAt(j)+ reverseString(s , j-1);
    }
}
