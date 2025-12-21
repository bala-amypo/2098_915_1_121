package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "exam_sessions")
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exam_name")
    private String examName;

    @Column(name = "exam_date")
    private LocalDate examDate;

    @Column(name = "duration")
    private Integer duration;

    // 🔥 REQUIRED because services call getStudents()
    @OneToMany
    @JoinColumn(name = "exam_session_id")
    private List<Student> students;

    public ExamSession() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    // 🔥 THIS METHOD FIXES YOUR ERROR
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
