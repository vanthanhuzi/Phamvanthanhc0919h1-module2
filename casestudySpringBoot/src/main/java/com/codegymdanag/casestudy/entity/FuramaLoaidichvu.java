package com.codegymdanag.casestudy.entity;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaidichvu")
public class FuramaLoaidichvu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loaidichvu")
    private int idloaidichvu;
    @Column(name = "ten_loaidichvu")
    private String tenLoaiDichVu;
    @OneToMany(targetEntity = Furamadichvu.class)
    private List<Furamadichvu> furamadichvuList;
    public FuramaLoaidichvu() {
    }

    public int getId() {
        return idloaidichvu;
    }

    public void setId(int id) {
        this.idloaidichvu = id;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public List<Furamadichvu> getFuramadichvuList() {
        return furamadichvuList;
    }

    public void setFuramadichvuList(List<Furamadichvu> furamadichvuList) {
        this.furamadichvuList = furamadichvuList;
    }
}
