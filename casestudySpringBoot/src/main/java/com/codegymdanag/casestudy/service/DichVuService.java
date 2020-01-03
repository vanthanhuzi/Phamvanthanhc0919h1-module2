package com.codegymdanag.casestudy.service;

import com.codegymdanag.casestudy.entity.Furamadichvu;

import java.util.Optional;

public interface DichVuService {
    Iterable<Furamadichvu> getAllService();
    Furamadichvu findById(Long id);
    void saveService(Furamadichvu furamadichvu);
    void removeDichVu(Long id);
    Iterable<Furamadichvu> getAllDependentPrice(Integer fromPrice, Integer toPrice);
}
