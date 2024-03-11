package ThreadSynchronized;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SynchronizedApp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();
        ExecutorService es = Executors.newCachedThreadPool();
        Adder adder = new Adder(v);
        Subtractor subtractor = new Subtractor(v);
        Future<Void> esAdd = es.submit(adder);
        Future<Void> esSubtract = es.submit(subtractor);
        esAdd.get();
        esSubtract.get();

        System.out.println("Final Value for i "+v.i);


    }
}
