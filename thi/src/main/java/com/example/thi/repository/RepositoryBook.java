package com.example.thi.repository;

import com.example.thi.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface RepositoryBook extends JpaRepository<Book, Long> {
Page<Book> findAllByMaSachLike(String masach, Pageable pageable);
//Page<Book> findAllByNameBookLike(String tensach, Pageable pageable);
//Page<Book> findAllByNameBookLikeandAndMaSachLike(String tensach, String masach,Pageable pageable);
}

