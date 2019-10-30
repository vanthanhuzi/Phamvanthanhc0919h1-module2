package instanceoF;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        System.out.println(child instanceof Parent);
    }
}
