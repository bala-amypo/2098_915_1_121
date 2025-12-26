package com.example.demo.model;

public class Student {
    private long id;
    private String name;
    private String rollNumber;
    private String department;

    public Student() {}

    public static Student builder() {
        return new Student();
    }

    public Student id(long id) {
        this.id = id;
        return this;
    }

    public Student name(String name) {
        this.name = name;
        return this;
    }

    public Student rollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public Student department(String department) {
        this.department = department;
        return this;
    }

    public Student build() {
        return this;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
