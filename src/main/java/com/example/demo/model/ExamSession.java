package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class ExamSession {

    @Id
    private int sessionId;
    private String subject;
    private String examDate;

    public ExamSession() {
    }

    public ExamSession(int sessionId, String subject, String examDate) {
        this.sessionId = sessionId;
        this.subject = subject;
        this.examDate = examDate;
    }

    public int getSessionId() {
        return sessionId;
    }
    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExamDate() {
        return examDate;
    }
    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
}
