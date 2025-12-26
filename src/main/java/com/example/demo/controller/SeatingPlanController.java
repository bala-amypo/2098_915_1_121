package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class SeatingPlanController {

    private SeatingPlanService service;

    // ✅ REQUIRED
    public SeatingPlanController() {}

    // ✅ REQUIRED
    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    public ResponseEntity<SeatingPlan> generate(Long sessionId) {
        return ResponseEntity.ok(service.generatePlan(sessionId));
    }

    public ResponseEntity<List<SeatingPlan>> list(Long sessionId) {
        return ResponseEntity.ok(service.getPlansBySession(sessionId));
    }
}
