package Java8;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersinList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.forEach(i->{if (i%2==0) System.out.println(i);});

        //streamAPI
        myList.stream().filter(i->i%2==0).forEach(System.out::println);

    }
}
