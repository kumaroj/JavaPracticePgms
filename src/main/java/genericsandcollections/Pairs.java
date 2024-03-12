package genericsandcollections;

import java.util.List;

public class Pairs <A , B>{

    A first;
    B second;

    Pairs(A first, B second){
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public void doSomething(String greeting){
        System.out.println(greeting);
        System.out.println(first);
        System.out.println(second);
    }

    public void printFirstList(List<? extends A>aList){
        aList.forEach((x) -> System.out.println(x));
    }
}
