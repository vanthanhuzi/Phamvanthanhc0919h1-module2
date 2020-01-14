package opp;

import java.util.Scanner;

public class CanBo {
    String hoTen;
    String gioiTinh;
    String diaChi;
    int tuoi;

    public CanBo() {
    }

    public CanBo(String hoTen, String gioiTinh, String diaChi, int tuoi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Họ tên");
        hoTen = scanner.nextLine();
        System.out.println("tuổi: ");
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("dịa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.println("giới tính ");
        gioiTinh = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
