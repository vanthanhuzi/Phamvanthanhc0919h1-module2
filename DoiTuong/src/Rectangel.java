import java.util.Scanner;

class Rectangel {
    int width, height;

    public Rectangel() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangel thanh = new Rectangel();
        System.out.println("nhập vào giá trị chiều rộng: ");
        thanh.setWidth(input.nextInt());
        System.out.println("nhập vào giá trị chiều dài: ");
        thanh.setHeight(input.nextInt());
        thanh.disPlay();

    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void disPlay() {
        System.out.println("width = " + getWidth() + "height = " + getHeight());
        System.out.println("Area = " + getArea() + " Perimeter = " + getPerimeter());
    }
}
