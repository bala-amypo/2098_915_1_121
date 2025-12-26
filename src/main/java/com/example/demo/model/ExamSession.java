package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Student> students;

    public Long getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }
}
