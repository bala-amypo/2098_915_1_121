package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plans")
public class SeatingPlanController {

    private final SeatingPlanService service;

    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<SeatingPlan> generate(@RequestParam Long sessionId, @RequestParam Long roomId) {
        return ResponseEntity.ok(service.generatePlan(sessionId, roomId));
    }

    @GetMapping("/{sessionId}")
    public ResponseEntity<List<SeatingPlan>> getBySession(@PathVariable Long sessionId) {
        return ResponseEntity.ok(service.getPlansBySession(sessionId));
    }
}
