package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SeatingPlan {

    @Id
    private Long id;
    private String name;
    private String department;
    private int year;

    public SeatingPlan() {
    }

    public SeatingPlan(Long id, String name, String department, int year) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.year = year;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
