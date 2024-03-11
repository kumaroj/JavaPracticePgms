package ThreadSynchronized;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    private Value v;

    Subtractor(Value v) {
        this.v = v;
    }
    @Override
    public Void call() throws Exception {
        for (int k = 1; k<=5000; k++){
                v.i-=k;
           // System.out.println("Subtracted "+ k );
        }

        return null;
    }
}
