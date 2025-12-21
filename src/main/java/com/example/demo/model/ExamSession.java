package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exam_sessions")
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseCode;

    private String examDate;

    private String examTime;

    // DEFAULT CONSTRUCTOR
    public ExamSession() {
    }

    // PARAMETERIZED CONSTRUCTOR
    public ExamSession(Long id, String courseCode, String examDate, String examTime) {
        this.id = id;
        this.courseCode = courseCode;
        this.examDate = examDate;
        this.examTime = examTime;
    }

    // GETTERS & SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }
}
