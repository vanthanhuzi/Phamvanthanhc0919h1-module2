package Iterator;

import java.util.Scanner;

public class Animal {
    String name;
    String color;
    int age;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.println("name");
        name = input.nextLine();
        System.out.println("age");
        age = input.nextInt();
        System.out.println("color");
        color = input.next();
    }

    public void showAnimal() {
        System.out.println("name " + getName() +
                " age " + getAge() + " color " + getColor());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Animal){
            if(((Animal)obj).getColor()==this.getColor()&& this.getColor()=="red"){
                return true;
            }else return false;

        }
        else return false;
    }
}
