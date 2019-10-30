package test;

public class phuongtrinh {
    int a;
    int b;
    int c;
    double x1,x2;
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
    public void setC(int c){
        this.c = c;
    }
    public int getC(){
        return c;
    }
    public double delta(){
        return getB()*getB()-4*getA()*getC();
    }
    public void tinhtoan(){
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
