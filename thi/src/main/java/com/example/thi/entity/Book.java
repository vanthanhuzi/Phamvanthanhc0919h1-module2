package com.example.thi.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Long id;

    @Column(name = "masach")
    private String maSach;


    @Column(name = "tensach")
    private String nameBook;

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    @Column(name = "tacgia")
    private String tacGia;
    //    @Pattern(regexp = "^[10000-100000000]{1}$", message = "là chữ số và lớn hơn 10.000 vnd")
    @Column(name = "giaban")
    private String giaBan;

    public Book() {
    }

    public Book(String maSach, String nameBook, String giaBan, String tacGia) {
        this.maSach = maSach;
        this.nameBook = nameBook;
        this.giaBan = giaBan;
        this.tacGia =tacGia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }
}
