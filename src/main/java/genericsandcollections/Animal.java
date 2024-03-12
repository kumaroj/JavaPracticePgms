package genericsandcollections;

public class Animal {

    int age = 21;
    int weight = 80;

    String name = "Manish";

    public Animal(){

    }

    public Animal(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }


}
