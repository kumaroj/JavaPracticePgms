package Threads.Problems.FooBar;

public class BarPrinter implements  Runnable{
    @Override
    public void run() {
        System.out.println("Bar");
    }
}
