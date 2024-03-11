package Threads.Problems.TableCreator;

public class TableCreator implements  Runnable{

    private int num;
    TableCreator(int num){
        this.num = num;
    }
    @Override
    public void run() {

        for(int i = 1; i<=10 ; i++){
            System.out.println(num +" times " + i +" is " +num*i);
        }
    }
}
