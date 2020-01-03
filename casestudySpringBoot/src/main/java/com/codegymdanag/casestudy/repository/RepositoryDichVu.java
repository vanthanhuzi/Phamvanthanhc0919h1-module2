package com.codegymdanag.casestudy.repository;

import com.codegymdanag.casestudy.entity.Furamadichvu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDichVu  extends JpaRepository<Furamadichvu,Long> {
    Iterable<Furamadichvu> findAllByChiPhiThueBetween(Integer fromPrice,Integer toPrice);
}
