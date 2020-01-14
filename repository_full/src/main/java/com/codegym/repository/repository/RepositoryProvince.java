package com.codegym.repository.repository;

import com.codegym.repository.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProvince extends JpaRepository<Province,Long> {

}
