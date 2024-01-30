
package lamdasandstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach((ele) -> System.out.println(ele));

        list.stream().map((ele)->ele*2).
                filter((ele)-> ele>=10).forEach((ele)-> System.out.println(ele));



    }
}