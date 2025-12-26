package com.example.demo.model;

import java.time.LocalDateTime;

public class SeatingPlan {
    private long id;
    private ExamSession examSession;
    private ExamRoom room;
    private String arrangementJson;
    private LocalDateTime generatedAt;

    public SeatingPlan() {}

    public static SeatingPlan builder() {
        return new SeatingPlan();
    }

    public SeatingPlan id(long id) {
        this.id = id;
        return this;
    }

    public SeatingPlan examSession(ExamSession examSession) {
        this.examSession = examSession;
        return this;
    }

    public SeatingPlan room(ExamRoom room) {
        this.room = room;
        return this;
    }

    public SeatingPlan arrangementJson(String arrangementJson) {
        this.arrangementJson = arrangementJson;
        return this;
    }

    public SeatingPlan generatedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
        return this;
    }

    public SeatingPlan build() {
        return this;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public ExamSession getExamSession() { return examSession; }
    public ExamRoom getRoom() { return room; }

    public String getArrangementJson() { return arrangementJson; }
    public void setArrangementJson(String arrangementJson) { this.arrangementJson = arrangementJson; }

    public LocalDateTime getGeneratedAt() { return generatedAt; }
    public void setGeneratedAt(LocalDateTime generatedAt) { this.generatedAt = generatedAt; }
}
