package instanceoF;

public class Chi extends Parent {
    public static void main(String[] args) {
        Chi chi = new Chi();
        Parent parent = new Parent();
        System.out.println(parent instanceof Chi);
    }
}
