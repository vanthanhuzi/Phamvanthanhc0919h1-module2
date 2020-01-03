package com.codegymdanag.casestudy.service;

import com.codegymdanag.casestudy.entity.FuramaKhachHang;
import com.codegymdanag.casestudy.repository.RepositoryKhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    RepositoryKhachHang repositoryKhachHang;
    @Override
    public Iterable<FuramaKhachHang> getAllKhachHang() {
        return repositoryKhachHang.findAll();
    }

    @Override
    public FuramaKhachHang findById(Long id) {
        return repositoryKhachHang.findById(id).orElse(null);
    }

    @Override
    public void saveKhachHang(FuramaKhachHang furamaKhachHang) {
        repositoryKhachHang.save(furamaKhachHang);

    }

    @Override
    public void removeKhachHang(Long id) {
        repositoryKhachHang.deleteById(id);

    }
}
