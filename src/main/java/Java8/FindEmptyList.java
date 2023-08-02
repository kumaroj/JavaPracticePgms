package Java8;

import java.util.*;

public class FindEmptyList {
    public static void main(String[] args) {

        List<String> notes = new ArrayList<String>();
        notes.add("note1");
        notes.add("note2");
        notes.add("note3");
        notes.add("note4");
        notes.add("note5");

/*        Optional.ofNullable(notes).orElseGet(Collections.emptyList()).stream().filter(Objects.nonNull())
                .map(note->notes::).forEach(System.out::println);*/
    }


}
