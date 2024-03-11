package Threads.Problems.FooBar;

import java.util.concurrent.Semaphore;

public class FooBar implements Runnable {

    private  int n;


    private Semaphore foosemaphore = new Semaphore(1);
    private Semaphore barsemaphore = new Semaphore(0);
    public  FooBar(int n){
        this.n = n;
    }

    public void foo(Runnable printfoo) throws InterruptedException{


        for (int i = 0; i<n ; i++){
            foosemaphore.acquire();
           // synchronized (printfoo)
                printfoo.run();
            barsemaphore.release();
        }
    }

    public void bar(Runnable printbar) throws InterruptedException{

        for (int i = 0; i<n ; i++){
            barsemaphore.acquire();
          //  synchronized (printbar)
                printbar.run();
             foosemaphore.release();
        }
    }

    @Override
    public void run() {

    }
}
