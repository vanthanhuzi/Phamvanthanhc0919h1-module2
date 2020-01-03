package com.codegymdanag.casestudy.entity;

import javax.persistence.*;

@Entity
@Table(name = "dichvu")
public class Furamadichvu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dichvu")
    private Long iddichvu;
    @Column(name = "ten_dichvu")
    private String tenDichVu;
    @Column(name = "dientich")
    private int dientich;
    @Column(name = "sotang")
    private int soTang;
    @Column(name = "songuoitoida")
    private int soNguoiToiDa;
    @Column(name = "chiphithue")
    private int chiPhiThue;
    @Column(name = "trangthai")
    private String trangThai;
    @Column(name = "id_kieuthue")
    private int idKieuThue;
    @ManyToOne
    @JoinColumn(name = "id_loaidichvu")
    private FuramaLoaidichvu furamaLoaidichvu;

    public Furamadichvu() {
    }

    public Long getIddichvu() {
        return iddichvu;
    }

    public void setIddichvu(Long iddichvu) {
        this.iddichvu = iddichvu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdKieuThue() {
        return idKieuThue;
    }

    public void setIdKieuThue(int idKieuThue) {
        this.idKieuThue = idKieuThue;
    }

    public FuramaLoaidichvu getFuramaLoaidichvu() {
        return furamaLoaidichvu;
    }

    public void setFuramaLoaidichvu(FuramaLoaidichvu furamaLoaidichvu) {
        this.furamaLoaidichvu = furamaLoaidichvu;
    }
}
