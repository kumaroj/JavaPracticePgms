package Java8;

import java.util.Arrays;
import java.util.List;

public class MaxELementinList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int maxval = myList.stream().max(Integer::compare).get();
        System.out.println(maxval);

    }


}
