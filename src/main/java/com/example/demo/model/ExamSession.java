package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ExamSession {

    @Id
    @GeneratedValue
    private Long id;

    private String courseCode;
    private LocalDate examDate;
    private String examTime;

    @ManyToMany
    private Set<Student> students = new HashSet<>();

    public ExamSession(){}

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getCourseCode(){ return courseCode; }
    public void setCourseCode(String courseCode){ this.courseCode = courseCode; }

    public LocalDate getExamDate(){ return examDate; }
    public void setExamDate(LocalDate examDate){ this.examDate = examDate; }

    public String getExamTime(){ return examTime; }
    public void setExamTime(String examTime){ this.examTime = examTime; }

    public Set<Student> getStudents(){ return students; }
    public void setStudents(Set<Student> students){ this.students = students; }

    public static Builder builder(){ return new Builder(); }

    public static class Builder {
        private final ExamSession s = new ExamSession();
        public Builder id(Long id){ s.setId(id); return this; }
        public Builder courseCode(String c){ s.setCourseCode(c); return this; }
        public Builder examDate(LocalDate d){ s.setExamDate(d); return this; }
        public Builder examTime(String t){ s.setExamTime(t); return this; }
        public Builder students(Set<Student> st){ s.setStudents(st); return this; }
        public ExamSession build(){ return s; }
    }
}
