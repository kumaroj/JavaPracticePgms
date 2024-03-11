package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    private Value v;
    private Lock lock;

    Adder( Value v , Lock lock){
        this.v = v;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {


        for (int k = 1; k<=50; k++){
            lock.lock();
           v.i+=k;
           System.out.println("Added "+ k );
            lock.unlock();

        }

        return null;
    }
}
