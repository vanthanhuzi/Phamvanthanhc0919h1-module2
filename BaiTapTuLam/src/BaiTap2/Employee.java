package BaiTap2;

public class Employee extends Person {
    private double luong;
    public Employee(){
    }
    public Employee(String ten, double luong){
        super(ten);
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
