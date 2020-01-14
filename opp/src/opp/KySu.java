package opp;

import java.util.Scanner;

public class KySu extends CanBo {
     String NganhDaoTao;
     public KySu(){

     }

    public KySu(String hoTen, String gioiTinh, String diaChi, int tuoi, String nganhDaoTao) {
        super(hoTen, gioiTinh, diaChi, tuoi);
        NganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    @Override
    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfor();
        System.out.println("ngành đào tạo: ");
        NganhDaoTao = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "KySu{" +
                "NganhDaoTao='" + NganhDaoTao + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
