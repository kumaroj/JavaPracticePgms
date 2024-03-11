package Threads.producerconsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
    public static void main(String[] args) {

      List<Object> al = new ArrayList<>();
      Store   store = new Store(al , 5);
      ExecutorService pool = Executors.newCachedThreadPool();

      for (int i = 1; i<=8; i++){
           Producer producer= new Producer(store);
           pool.execute(producer);
      }

        for (int i = 1; i<=20; i++){
            Consumer consumer= new Consumer(store);
            pool.execute(consumer);
        }



    }
}
