package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDate;

@Entity
@Table(name = "exam_sessions")
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate examDate;

    @OneToMany(mappedBy = "examSession")
    private List<SeatingPlan> seatingPlans; // or List<Student> students if you have Student entity

    public ExamSession() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getExamDate() { return examDate; }
    public void setExamDate(LocalDate examDate) { this.examDate = examDate; }

    public List<SeatingPlan> getSeatingPlans() { return seatingPlans; }
    public void setSeatingPlans(List<SeatingPlan> seatingPlans) { this.seatingPlans = seatingPlans; }
}
