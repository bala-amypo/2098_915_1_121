package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "exam_session_id")
    private ExamSession examSession;

    // ===== Constructors =====
    public Student() { }

    public Student(String name, ExamSession examSession) {
        this.name = name;
        this.examSession = examSession;
    }

    // ===== Getters & Setters =====
    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public ExamSession getExamSession() { return examSession; }

    public void setExamSession(ExamSession examSession) { this.examSession = examSession; }
}
