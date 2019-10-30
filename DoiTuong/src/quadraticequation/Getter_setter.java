package quadraticequation;

public class Getter_setter {
    private int a;
    private int b;
    private int c;

    void setA(int a) {
        this.a = a;
    }

    int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    int getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
    }

    int getC() {
        return c;
    }

    double delta() {
        return (getB() * getB() - 4 * getA() * getC());
    }
}
