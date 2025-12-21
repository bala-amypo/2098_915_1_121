package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SeatingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ExamSession examSession;

    @ManyToOne
    private ExamRoom room;

    private String arrangementJson;

    private LocalDateTime generatedAt;

    @PrePersist
    public void onCreate() {
        generatedAt = LocalDateTime.now();
    }

    public SeatingPlan() {}

    public SeatingPlan(Long id, ExamSession examSession, ExamRoom room, String arrangementJson) {
        this.id = id;
        this.examSession = examSession;
        this.room = room;
        this.arrangementJson = arrangementJson;
    }

    public Long getId() { return id; }
    public ExamSession getExamSession() { return examSession; }
    public ExamRoom getRoom() { return room; }
    public String getArrangementJson() { return arrangementJson; }
    public LocalDateTime getGeneratedAt() { return generatedAt; }
}
