package com.codegymdanag.casestudy.service;

import com.codegymdanag.casestudy.entity.FuramaKhachHang;

public interface KhachHangService {
    Iterable<FuramaKhachHang> getAllKhachHang();

    FuramaKhachHang findById(Long id);

    public void saveKhachHang(FuramaKhachHang furamaKhachHang);


    public void removeKhachHang(Long id);
}
