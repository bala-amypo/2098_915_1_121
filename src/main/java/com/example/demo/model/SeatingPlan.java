package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SeatingPlan {

    @Id
    @GeneratedValue
    private Long id;

    private Long sessionId;

    @ManyToOne
    private ExamSession examSession;

    @ManyToOne
    private ExamRoom room;

    private String arrangementJson;
    private LocalDateTime generatedAt;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public Long getSessionId(){ return sessionId; }
    public void setSessionId(Long sessionId){ this.sessionId = sessionId; }

    public ExamSession getExamSession(){ return examSession; }
    public void setExamSession(ExamSession e){ this.examSession = e; }

    public ExamRoom getRoom(){ return room; }
    public void setRoom(ExamRoom r){ this.room = r; }

    public String getArrangementJson(){ return arrangementJson; }
    public void setArrangementJson(String a){ this.arrangementJson = a; }

    public LocalDateTime getGeneratedAt(){ return generatedAt; }
    public void setGeneratedAt(LocalDateTime g){ this.generatedAt = g; }
}
