package Threads.Synchronized;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    private Value v;

    Subtractor(Value v) {
        this.v = v;
    }
    @Override
    public Void call() throws Exception {
        for (int k = 1; k<=5000; k++){
            synchronized (v){
                v.i-=k;
            }

           // System.out.println("Subtracted "+ k );
        }

        return null;
    }
}
