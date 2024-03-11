package Threads;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        doSomething();
        System.out.println("Hello World by run() method "+ Thread.currentThread().getName());
        getSomething();
    }

    public void doSomething(){
        System.out.println("Hello World by do() method " + Thread.currentThread().getName());
    }

    public  void getSomething(){
        System.out.println("Get something from the world "+ Thread.currentThread().getName());
    }
}
