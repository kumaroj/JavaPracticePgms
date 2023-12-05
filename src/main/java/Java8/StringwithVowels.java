package Java8;

import sun.security.jca.Providers;

import java.util.Arrays;
@FunctionalInterface
interface  Verification{
    public boolean verifyVowel(String s);
}
public class StringwithVowels {

    public static void main(String[] args) {
        Verification verification;
        verification =(s)->{
            String vowel = "aeiouAEIOU";
            for (int i = 0; i<s.length(); i++){
                if (vowel.indexOf(s.charAt(i))!=-1)
                    return true;
            }
            return false;
        };

        System.out.println( verification.verifyVowel("lambada"));
    }


}
