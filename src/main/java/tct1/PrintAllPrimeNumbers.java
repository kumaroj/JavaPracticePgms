package tct1;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPrimeNumbers {

    public static void main(String[] args) {

       List<Integer>ans = findPrimeNumbers(17);
       System.out.println(ans);
    }

    public static List<Integer> findPrimeNumbers(int n){

     List<Integer>  primeList = new ArrayList<>();
     for (int i = 2; i<=n; i++){
        if(isPrime(i))
            primeList.add(i);
     }

        return primeList;
    }

    public  static boolean isPrime( int n){

        if (n<=1)
             return false;

        for (int i = 2; i<n ; i++){
            if (n%i == 0)
                return  false;
        }

        return true;
    }
}
