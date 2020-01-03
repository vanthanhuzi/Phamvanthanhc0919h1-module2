package com.codegymdanag.casestudy.service;

import com.codegymdanag.casestudy.entity.Furamadichvu;
import com.codegymdanag.casestudy.repository.RepositoryDichVu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    RepositoryDichVu repositoryDichVu;

    @Override
    public Iterable<Furamadichvu> getAllService() {
        return repositoryDichVu.findAll();
    }

    @Override
    public Furamadichvu findById(Long id) {
        return repositoryDichVu.findById(id).orElse(null);
    }

    @Override
    public void saveService(Furamadichvu furamadichvu) {
        repositoryDichVu.save(furamadichvu);

    }

    @Override
    public void removeDichVu(Long id) {
        repositoryDichVu.deleteById(id);
    }

    @Override
    public Iterable<Furamadichvu> getAllDependentPrice(Integer fromPrice, Integer toPrice) {
        return repositoryDichVu.findAllByChiPhiThueBetween(fromPrice, toPrice);
    }


}
