package genericsandcollections;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        Pairs<Integer, String> pairs= new Pairs<Integer, String>(1 , "Hi");
        System.out.println(pairs.getFirst());
        System.out.println(pairs.getSecond());

        System.out.println("**********");

       Pairs<String , String> secondpairs = new Pairs<String, String>("Hello" , "Hi");
       secondpairs.doSomething("Its Java Generics");

        System.out.println("*************");


       Pairs<Integer , String> thirdpairs = new Pairs<Integer, String>(1 , "Hi");
       thirdpairs.printFirstList(Arrays.asList(3, 1,8, 9));


        Pairs<Animal , Integer> animalStringPairs = new Pairs<Animal , Integer>(new Animal() , 4);
        animalStringPairs.doSomething("Its Animal pair");

        List<Animal> animalList = new ArrayList<Animal>();
        Animal a1 = new Animal(16,76,"Tommy");
        Animal a2 = new Animal(16,76,"Bruno");
        Animal a3 = new Animal(16,76,"Bunty");
        Animal a4 = new Dog(16,76,"Selvi", 6);
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);
        animalStringPairs.printFirstList(animalList);
        System.out.println("**********");

      List<Dog> dogList=  new ArrayList<Dog>();
      Dog d1 = new Dog(16,76,"Selvi", 6);
      Dog d2 = new Dog(16,76,"Mars", 6);
      Dog d3 = new Dog(16,76,"Juni", 6);
      Dog d4 = new Dog(16,76,"Striver", 6);
      dogList.add(d1);
      dogList.add(d2);
      dogList.add(d3);
      dogList.add(d4);


        // dogs -> List<Dog>
        // animalCounts.FIRST -> ANIMAL
        // animalCounts.printMoreFirsts -> List<Animal>
        // Can I pass dogs to printMoreFirsts(dogs)
        // Can I pass List<Dog> to something that needs List<Animal>

        // Intuitively:
        // If I can pass a Dog to a variable of data type Animal
        // I should be able to pass a List<Dog> to a variable of type List<Animal>
      animalStringPairs.printFirstList(dogList);

      List<? extends Animal> l2 = dogList;
      l2.forEach(x -> System.out.println(x));


    }
}
