package com.codegymdanag.casestudy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name = "khachhang")
public class FuramaKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_khachhang")
    private Long idKhachHang;
    @Column(name = "id_loaikhach")
    private Long idLoaiKhachHang;
    @NotEmpty(message = "bạn không được để trống ")
    @Column(name = "hoten_khach")
    private String hoTenKhach;
    @Column(name = "ngaysinh_khach")
    private Date ngaySinh;
    @NotEmpty(message = "bạn không được để trống ")
    @Column(name = "so_cmnd_khach")
    private String soCmnd;
    @NotEmpty(message = "bạn hãy nhập số điện thoại")
    @Column(name = "sdt_khach")
    private String sdt;
    @NotEmpty
    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",
            message = "bạn phải nhập email hợp lệ")
    @Column(name = "email_khach")
    private String email;
    @NotEmpty(message = "bạn không được để trống ")
    @Column(name = "diachi_khach")
    private String diaChi;

    public FuramaKhachHang() {
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Long getIdLoaiKhachHang() {
        return idLoaiKhachHang;
    }

    public void setIdLoaiKhachHang(Long idLoaiKhachHang) {
        this.idLoaiKhachHang = idLoaiKhachHang;
    }

    public String getHoTenKhach() {
        return hoTenKhach;
    }

    public void setHoTenKhach(String hoTenKhach) {
        this.hoTenKhach = hoTenKhach;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
