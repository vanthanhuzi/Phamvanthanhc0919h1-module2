package fruit;
import animal.Chicken;
import animal.Tiger;
import animal.Animal;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal test : animals) {
            System.out.println(test.makeSound());
        }
    }
}
