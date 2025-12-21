package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate examDate;

    @OneToMany(mappedBy = "examSession", cascade = CascadeType.ALL)
    private List<Student> students;

    // No-arg constructor
    public ExamSession() {}

    // All-arg constructor
    public ExamSession(Long id, String name, LocalDate examDate, List<Student> students) {
        this.id = id;
        this.name = name;
        this.examDate = examDate;
        this.students = students;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getExamDate() { return examDate; }
    public void setExamDate(LocalDate examDate) { this.examDate = examDate; }

    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }
}
