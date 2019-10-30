package Baitap1.Main;

import java.util.Scanner;

public class Student extends Person {
    String rollNo;
    float avgMark;
    String email;

    public Student() {
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên: ");
        while (true) {
            boolean check = setRollNo(input.nextLine());
            if (check)
                break;
        }
        System.out.println("nhập vào điểm trung bình: ");
        while (!setAvgMark(Float.parseFloat(input.nextLine())));//dòng này có nghĩa là khi điểm trung bình nhập vào là sai thì vòng lặp bắt nhập lại;
        System.out.println("nhập email: ");
        while (!setEmail(input.nextLine()));
    }
@Override
public void showInfor(){
        super.showInfor();
    System.out.println("mã sinh viên của bạn là:" + rollNo + ";"+
            "Điểm trung bình của bạn là "+ avgMark + ";"+ "Email: "+ email);
}
    public boolean setRollNo(String rollNo) {
        if (rollNo != null && rollNo.length() == 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.err.println("Nhập lại (độ dài mã bằng 8)");
            return false;
        }
    }

    public String getRollNo() {
        return rollNo;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public boolean setAvgMark(float avgMark) {
        if (avgMark >= 0 && avgMark <= 10) {
            this.avgMark = avgMark;
            return true;
        } else {
            System.out.println("nhập lại điểm trung bình(<=10 && >=0)");
            return false;
        }
    }
    public String getEmail(){
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" ")){
        this.email = email;
        return true;
        }
        else {
            System.err.println("bạn hãy nhập lại( email k chứa khoảng trắng và phải có kí tự @)");
            return false;
        }
    }
}
