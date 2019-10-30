package giaide1;

import java.util.Scanner;

/* Đề: định nghĩa Class Person với các thuộc tính họ tên, ngày sinh, địa chỉ , giới tính , các phương thức khởi tạo,
hiển thị thông tin.
b/ định nghĩa Class Student kế thừa Person có thêm các thuộc tính mã sinh viên, email , điểm tổng kết, và các phương
thức khởi tạo để hiển thị thông tin.
 */
public class Person {
    String fullName;
    String birthDay;
    String address;
    boolean gender;

    public Person() {
    }

    public Person(String fullName, String birthDay, String address, boolean gender) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
