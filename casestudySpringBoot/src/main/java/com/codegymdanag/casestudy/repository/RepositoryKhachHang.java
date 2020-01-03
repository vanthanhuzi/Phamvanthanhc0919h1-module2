package com.codegymdanag.casestudy.repository;

import com.codegymdanag.casestudy.entity.FuramaKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryKhachHang extends JpaRepository<FuramaKhachHang, Long> {
}
