package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "seating_plan")
public class SeatingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "exam_session_id")
    private ExamSession examSession;

    @ManyToOne
    @JoinColumn(name = "exam_room_id")
    private ExamRoom examRoom;

    // ✅ Default constructor
    public SeatingPlan() {
    }

    // ✅ Parameterized constructor
    public SeatingPlan(Long id, ExamSession examSession, ExamRoom examRoom) {
        this.id = id;
        this.examSession = examSession;
        this.examRoom = examRoom;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExamSession getExamSession() {
        return examSession;
    }

    public void setExamSession(ExamSession examSession) {
        this.examSession = examSession;
    }

    public ExamRoom getExamRoom() {
        return examRoom;
    }

    public void setExamRoom(ExamRoom examRoom) {
        this.examRoom = examRoom;
    }
}
