package com.example.thi.service;

import com.example.thi.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    Iterable<Book> getAllBook();
    Book findById(Long id);
    void saveBook(Book book);
    void deletedById(Long id);
    Page<Book> findAllByMaSachLike(String masach, Pageable pageable);
    Page<Book> findAll(Pageable pageable);
//    Page<Book> findAllByNameBookLike(String tensach, Pageable pageable);
//    Page<Book> findAllByNameBookLikeandAndMaSachLike(String tensach, String masach,Pageable pageable);
}
