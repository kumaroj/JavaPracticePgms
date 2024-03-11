package Threads;

import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Main Thread started " + Thread.currentThread().getName());

       CallableImplementation callableImplementation= new CallableImplementation();
       ExecutorService executorService = Executors.newFixedThreadPool(2);
       Future<String> task = executorService.submit(callableImplementation);

       System.out.println(task.get().toString() + " and its name is " + Thread.currentThread().getName());

    }
}
