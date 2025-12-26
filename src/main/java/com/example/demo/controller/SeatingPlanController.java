package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class SeatingPlanController {

    private SeatingPlanService service;

    // ✅ REQUIRED: default constructor (used by tests)
    public SeatingPlanController() {}

    // ✅ REQUIRED: constructor injection (used by tests)
    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    // ✅ REQUIRED by tests
    // Generates a seating plan for a given exam session
    public ResponseEntity<SeatingPlan> generate(Long sessionId) {
        return ResponseEntity.ok(service.generatePlan(sessionId));
    }

    // ✅ REQUIRED by tests
    // Gets ONE seating plan for a session
    public ResponseEntity<SeatingPlan> get(long sessionId) {
        return ResponseEntity.ok(service.getPlan(sessionId));
    }

    // ✅ REQUIRED by tests
    // Gets ALL seating plans for a session
    public ResponseEntity<List<SeatingPlan>> list(Long sessionId) {
        return ResponseEntity.ok(service.getPlansBySession(sessionId));
    }
}
