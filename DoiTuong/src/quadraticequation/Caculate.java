package quadraticequation;

public class Caculate extends Getter_setter {
    double x1;
    double x2;

    public void tinhtoan() {
        if (delta() < 0) {
            System.out.println("phương trình vô nghiệm");
        }
        else if (delta() > 0) {
            System.out.println("phương trình có 2 nghiệm: ");
            x1 = ((-getB() - Math.sqrt(delta()) / (2 * getA())));
            System.out.println("x1 = "+ x1);
            x2 = ((-getB() + Math.sqrt(delta()) / (2 * getA())));
            System.out.println("x2 = "+ x2);
        }
        else  {
            System.out.println("phương trình có nghiệm kép");
            x1 = x2 = (-getB())/(2*getA());
            System.out.println("x1 = x2 = "+ x1);
        }
    }
}
