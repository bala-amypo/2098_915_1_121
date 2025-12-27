package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exam_sessions")
public class ExamSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String courseCode;
    private LocalDate examDate;
    private String examTime;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "session_students",
        joinColumns = @JoinColumn(name = "session_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> students = new HashSet<>();
    
    public ExamSession() {}
    
    public ExamSession(String courseCode, LocalDate examDate, String examTime, Set<Student> students) {
        this.courseCode = courseCode;
        this.examDate = examDate;
        this.examTime = examTime;
        this.students = students != null ? students : new HashSet<>();
    }
    
    public static ExamSessionBuilder builder() {
        return new ExamSessionBuilder();
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public LocalDate getExamDate() { return examDate; }
    public void setExamDate(LocalDate examDate) { this.examDate = examDate; }
    public String getExamTime() { return examTime; }
    public void setExamTime(String examTime) { this.examTime = examTime; }
    public Set<Student> getStudents() { return students; }
    public void setStudents(Set<Student> students) { this.students = students; }
    
    public static class ExamSessionBuilder {
        private Long id;
        private String courseCode;
        private LocalDate examDate;
        private String examTime;
        private Set<Student> students = new HashSet<>();
        
        public ExamSessionBuilder id(Long id) { this.id = id; return this; }
        public ExamSessionBuilder courseCode(String courseCode) { this.courseCode = courseCode; return this; }
        public ExamSessionBuilder examDate(LocalDate examDate) { this.examDate = examDate; return this; }
        public ExamSessionBuilder examTime(String examTime) { this.examTime = examTime; return this; }
        public ExamSessionBuilder students(Set<Student> students) { this.students = students; return this; }
        
        public ExamSession build() {
            ExamSession session = new ExamSession();
            session.id = this.id;
            session.courseCode = this.courseCode;
            session.examDate = this.examDate;
            session.examTime = this.examTime;
            session.students = this.students;
            return session;
        }
    }
}