package Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AdderSubtractor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v= new Value();
        v.i = 0;
        Lock lock = new ReentrantLock();
        Adder adder= new Adder(v , lock);
        Subtractor subtractor = new Subtractor(v  , lock);

        ExecutorService executors = Executors.newCachedThreadPool();
        Future<Void> adderfuture = executors.submit(adder);
        Future<Void> subtractorfuture = executors.submit(subtractor);

        adderfuture.get();
        subtractorfuture.get();

        System.out.println(v.i);

    }
}
