package giaide1;

public class Student extends Person {
    String maSinhVien;
    String eMail;
    int mark;


    public Student(String fullName, String birthDay, String address, boolean gender, String maSinhVien, String eMail, int mark) {
        super(fullName, birthDay, address, gender);
        this.maSinhVien = maSinhVien;
        this.eMail = eMail;
        this.mark = mark;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", eMail='" + eMail + '\'' +
                ", mark=" + mark +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
