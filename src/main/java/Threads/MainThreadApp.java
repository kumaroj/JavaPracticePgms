package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainThreadApp {
    public static void main(String[] args) throws Exception {

        System.out.println("This is the main Program");
        CallableImplementation callableImplementation = new CallableImplementation();
        ExecutorService exc = Executors.newCachedThreadPool();
        Future<String> task = exc.submit(callableImplementation);
        System.out.println(task.get());
        System.out.println("Program completed");


    }
}
