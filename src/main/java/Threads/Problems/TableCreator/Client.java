package Threads.Problems.TableCreator;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int input  = scan.nextInt();


      for(int i = 1; i<=input ; i++){

       TableCreator tableCreator = new TableCreator(i);
       Thread thread =new Thread(tableCreator);
       thread.start();
      }
    }
}
