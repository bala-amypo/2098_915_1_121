package com.example.demo.model;

import java.time.LocalDate;
import java.util.Set;

public class ExamSession {
    private long id;
    private String courseCode;
    private LocalDate examDate;
    private String examTime;
    private Set<Student> students;

    public ExamSession() {}

    public static ExamSession builder() {
        return new ExamSession();
    }

    public ExamSession id(long id) {
        this.id = id;
        return this;
    }

    public ExamSession courseCode(String courseCode) {
        this.courseCode = courseCode;
        return this;
    }

    public ExamSession examDate(LocalDate examDate) {
        this.examDate = examDate;
        return this;
    }

    public ExamSession examTime(String examTime) {
        this.examTime = examTime;
        return this;
    }

    public ExamSession students(Set<Student> students) {
        this.students = students;
        return this;
    }

    public ExamSession build() {
        return this;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public LocalDate getExamDate() { return examDate; }
    public void setExamDate(LocalDate examDate) { this.examDate = examDate; }

    public String getExamTime() { return examTime; }
    public void setExamTime(String examTime) { this.examTime = examTime; }

    public Set<Student> getStudents() { return students; }
    public void setStudents(Set<Student> students) { this.students = students; }
}
