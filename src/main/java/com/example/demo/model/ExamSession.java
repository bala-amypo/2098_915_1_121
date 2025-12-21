package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "examSession", cascade = CascadeType.ALL)
    private List<Student> students;

    // ===== Constructors =====
    public ExamSession() { }

    public ExamSession(String name) {
        this.name = name;
    }

    public ExamSession(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    // ===== Getters & Setters =====
    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Student> getStudents() { return students; }

    public void setStudents(List<Student> students) { this.students = students; }
}
