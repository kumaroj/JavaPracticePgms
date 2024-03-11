package ThreadSynchronized;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;


    Adder(Value v ){
        this.v = v;
    }
    @Override
    public Void call() throws Exception {

        for (int k = 1; k<=5000; k++){
                v.i+=k;
          // System.out.println("Added "+ k );
        }

        return null;
    }
}
