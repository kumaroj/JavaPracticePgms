package Threads;

/*
    This class will be used to print numbers from 1 to 100 . Each number being printed using Separate threads
    This is an example of Multithreaded program.
 */
public class NumberPrinterThread {
    public static void main(String[] args) {

        System.out.println("Starting the Multithreaded program");

        for (int i = 1; i<=100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
           Thread thread= new Thread(numberPrinter);
           thread.start();
        }

        System.out.println("Program Ended");
    }
}
