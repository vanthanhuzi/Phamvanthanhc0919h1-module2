package com.example.thi.service;

import com.example.thi.entity.Book;
import com.example.thi.repository.RepositoryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class Book1ServiceImpl implements BookService {
    @Autowired
    RepositoryBook repositoryBook;
    @Override
    public Iterable<Book> getAllBook() {
        return repositoryBook.findAll();
    }

    @Override
    public Book findById(Long id) {
        return repositoryBook.findById(id).orElse(null);
    }

    @Override
    public void saveBook(Book book) {
        repositoryBook.save(book);

    }

    @Override
    public void deletedById(Long id) {
repositoryBook.deleteById(id);
    }

    @Override
    public Page<Book> findAllByMaSachLike(String masach, Pageable pageable) {
        return repositoryBook.findAllByMaSachLike(masach,pageable);
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return repositoryBook.findAll(pageable);
    }


}
