package opp;

import java.util.Scanner;

public class CongNhan extends CanBo {
    int Bac;
    public CongNhan(){

    }

    public CongNhan(String hoTen, String gioiTinh, String diaChi, int tuoi, int bac) {
        super(hoTen, gioiTinh, diaChi, tuoi);
        Bac = bac;
    }

    public int getBac() {
        return Bac;
    }

    public boolean setBac(int bac) {
       if(bac<10 && bac>1){
           this.Bac = bac;
           return true;
       }
       else System.out.println("bạn nhập sai (1< bậc < 10)");
           return false;
    }

    @Override
    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfor();
        boolean check = false;
        System.out.println("nhập bậc của công nhân: ");
        while (check){
            check = setBac(Integer.parseInt(scanner.nextLine()));
            if(!check)
                break;

        }
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "Bac=" + Bac +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
