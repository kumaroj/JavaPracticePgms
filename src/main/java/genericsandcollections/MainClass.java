package genericsandcollections;

public class MainClass {
    public static void main(String[] args) {

       Pairs<Integer, String> pairs= new Pairs<Integer, String>(1 , "Hi");
        System.out.println(pairs.getFirst());
        System.out.println(pairs.getSecond());
    }
}
