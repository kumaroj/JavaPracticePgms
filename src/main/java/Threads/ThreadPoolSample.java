package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    This is program demonstrates working of ThreadPool
    In which we will create a Thread pool with fixed using executor service and assign the task
    to the threads in the thread pool.
 */
public class ThreadPoolSample {
    public static void main(String[] args) {

        System.out.println("Starting the Main Program");
        ExecutorService executors = Executors.newFixedThreadPool(10);
        for (int i = 0; i<=100; i++){
           NumberPrinter numberPrinter= new NumberPrinter(i);
            executors.execute(numberPrinter);
        }

        System.out.println("Main Thread ended");

    }
}
