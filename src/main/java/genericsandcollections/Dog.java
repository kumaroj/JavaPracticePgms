package genericsandcollections;

public class Dog extends Animal{
    int height = 6;

    public Dog(int age, int weight, String name, int height) {
        super(age, weight, name);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }


}
