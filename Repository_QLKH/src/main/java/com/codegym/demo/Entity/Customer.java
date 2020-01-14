package com.codegym.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name= "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString(){
        return String.format("Customer[id%d,firstName'%s',lastName='%s']", id,firstName,lastName);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
