package Threads;

public class MainApp {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

       HelloWorldPrinter helloWorldPrinter= new HelloWorldPrinter();
       Thread thread = new Thread(helloWorldPrinter);
       thread.start();
        System.out.println(a);
        System.out.println(b);

    }
}
