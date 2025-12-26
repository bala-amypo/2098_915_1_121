package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String department;
    private String rollNumber;

    public Student() {}

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getDepartment(){ return department; }
    public void setDepartment(String department){ this.department = department; }

    public String getRollNumber(){ return rollNumber; }
    public void setRollNumber(String rollNumber){ this.rollNumber = rollNumber; }

    public static Builder builder(){ return new Builder(); }

    public static class Builder {
        private final Student s = new Student();
        public Builder id(Long id){ s.setId(id); return this; }
        public Builder name(String n){ s.setName(n); return this; }
        public Builder department(String d){ s.setDepartment(d); return this; }
        public Builder rollNumber(String r){ s.setRollNumber(r); return this; }
        public Student build(){ return s; }
    }
}
