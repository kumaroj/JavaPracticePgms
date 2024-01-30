package Recursion;

public class MagicNumber {
    public static void main(String[] args) {

    }

    public static  int solve(int A){
       if (A<10)
           return (A ==1)?1:0;
          int num =  sum(A);
          return solve( num);


    }



    public static int sum(int A) {
        if (A == 0)
            return 0;

        return sum(A/10) + A%10;
    }
}
