package Threads;

/*
    This is the task created to print the number.This task then will be provided to thread
    to print the number .Each number should be printed using separate thread.
 */
public class NumberPrinter implements Runnable{
    private int number;
    public NumberPrinter(int Number){
        this.number = Number;
    }
    @Override
    public void run() {
        System.out.println("Number: " + number + " executed by Thread " + Thread.currentThread().getName());
    }
}
