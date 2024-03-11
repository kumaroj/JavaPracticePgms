package Threads.Problems.ThreadsWithCallables;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

       Scanner scan = new Scanner(System.in);
       int n =scan.nextInt();
       ExecutorService threadPool = Executors.newCachedThreadPool();
       ArrayCreator arrayCreator = new ArrayCreator(n);
       Future<List<Integer>> x =threadPool.submit(arrayCreator);
       System.out.println(x.get());


    }


}
