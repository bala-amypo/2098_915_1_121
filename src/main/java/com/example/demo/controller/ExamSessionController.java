package com.example.demo.controller;

import com.example.demo.model.ExamSession;
import com.example.demo.service.ExamSessionService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ExamSessionController {

    private ExamSessionService service;

    // ✅ REQUIRED
    public ExamSessionController() {}

    // ✅ REQUIRED
    public ExamSessionController(ExamSessionService service) {
        this.service = service;
    }

    public ResponseEntity<ExamSession> create(ExamSession session) {
        return ResponseEntity.ok(service.createSession(session));
    }

    public ResponseEntity<ExamSession> get(Long id) {
        return ResponseEntity.ok(service.getSession(id));
    }

    public ResponseEntity<List<ExamSession>> list() {
        return ResponseEntity.ok(service.getAllSessions());
    }
}
