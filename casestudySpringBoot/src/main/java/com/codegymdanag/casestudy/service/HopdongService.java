package com.codegymdanag.casestudy.service;

import com.codegymdanag.casestudy.entity.FuramaHopDong;
import com.codegymdanag.casestudy.repository.RepositoryHopDong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


public interface HopdongService {

    Iterable<FuramaHopDong> getAllHopDong();

    FuramaHopDong findById(Long id);

    public void saveHopDong(FuramaHopDong furamaHopDong);


     public void removeHopDong(Long id);
    Iterable<FuramaHopDong> findAllByIdKhachHang(Long id);
}
