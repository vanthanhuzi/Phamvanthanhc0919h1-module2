package com.codegymdanag.casestudy.service;

import com.codegymdanag.casestudy.entity.FuramaHopDong;
import com.codegymdanag.casestudy.repository.RepositoryHopDong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HopdongServiceImpl implements HopdongService {
    @Autowired
    RepositoryHopDong repositoryHopDong;
    @Override
    public Iterable<FuramaHopDong> getAllHopDong() {
        return repositoryHopDong.findAll();
    }

    @Override
    public FuramaHopDong findById(Long id) {
        return repositoryHopDong.findById(id).orElse(null);
    }

    @Override
    public void saveHopDong(FuramaHopDong furamaHopDong) {
        repositoryHopDong.save(furamaHopDong);
    }

    @Override
    public void removeHopDong(Long id) {
        repositoryHopDong.deleteById(id);
    }
}
