package com.codegymdanag.casestudy.repository;

import com.codegymdanag.casestudy.entity.FuramaHopDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryHopDong extends JpaRepository<FuramaHopDong, Long> {

}
