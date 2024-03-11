package Threads;

public class DemoThread {

    public static void doSomeThing(String s){

        System.out.println(s);
    }
    public static void main(String[] args) {

        System.out.println("Hello World"+Thread.currentThread().getName());
        doSomeThing("Its " + Thread.currentThread().getName() + " which is getting executed");

        //Thread thread =new Thread();
    }
}
