package Baitap1.Main;

import java.util.Scanner;

public class Person {
    String name;
    String gender;
    String birthday;
    String address;

    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = input.nextLine();
        System.out.println("Nhập giới tính:");
        gender = input.nextLine();
        System.out.println("Nhập ngày sinh: ");
        birthday = input.nextLine();
        System.out.println("Nhập địa chỉ: ");
        address = input.nextLine();
    }

    public void showInfor() {
        System.out.println("Tên : " + name + ";" +
                "Giới tính" + gender + ";" + "Ngày sinh : " + birthday + ";" + "Địa chỉ: " + address);
    }


}
