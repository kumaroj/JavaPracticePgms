package Threads.Problems.AdderSubtracter;

public class MainClient {
    public static void main(String[] args) {

        System.out.println(" I am Main class");
        Thread thread1 = new Thread(new Adder());
        Thread thread2 = new Thread(new Subtracter());

        thread1.start();
        thread2.start();
    }


}
