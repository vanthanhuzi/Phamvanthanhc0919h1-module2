package com.example.demo.Entity;

public class Mycount {
    private long count;

    public Mycount() {
    }

    public Mycount(int count) {
        this.count = count;
    }

    public long getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public long increment(){
        return count++;
    }
}
