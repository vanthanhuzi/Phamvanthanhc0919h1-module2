package com.codegymdanag.casestudy.entity;



import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hopdong")
public class FuramaHopDong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hopdong")
    private Long id;
    @Column(name = "id_nhanvien")
    private Long idNhanVien;
    @Column(name = "id_khachhang")
    private Long idKhachHang;
    @Column(name = "ngaylamhopdong")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ngayLamHopDong;
    @Column(name = "ngayketthuc")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ngayKetThuc;
    @Column(name = "id_dichvu")
    private Long idDichVu;
    @Column(name = "tiendatcoc")
    private double tienDatCoc;
    @Column(name = "tongtien")
    private double tongTien;

    public FuramaHopDong() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Long idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Date getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(Date ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Long getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(Long idDichVu) {
        this.idDichVu = idDichVu;
    }

    public double getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(double tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
