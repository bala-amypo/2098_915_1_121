package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rollNumber;
    private int year;

    public Long getId() {
        return id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getYear() {
        return year;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
