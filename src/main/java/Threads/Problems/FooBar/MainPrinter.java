package Threads.Problems.FooBar;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainPrinter {
    public static void main(String[] args) throws InterruptedException {

        FooBar foobar = new FooBar(5);
        FooPrinter fooPrinter = new FooPrinter();
        BarPrinter barPrinter = new BarPrinter();


       ExecutorService executors= Executors.newCachedThreadPool();
       /* Thread threadFoo = new Thread(fooPrinter);
        Thread threadBar = new Thread(barPrinter);*/

        executors.execute(fooPrinter);
        executors.execute(barPrinter);


    }
}
