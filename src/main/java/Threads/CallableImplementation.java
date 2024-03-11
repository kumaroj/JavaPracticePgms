package Threads;

import java.util.concurrent.Callable;

public class CallableImplementation implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Its another thread which runs parallel";
    }
}
