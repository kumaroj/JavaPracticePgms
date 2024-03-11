package Threads.Problems.FooBar;

public class FooPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Foo");
    }
}
