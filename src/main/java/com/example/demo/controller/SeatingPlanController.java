package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;

@RestController
@RequestMapping("/seating-plans")
public class SeatingPlanController {

    private final SeatingPlanService seatingPlanService;

    // ✅ Constructor Injection
    public SeatingPlanController(SeatingPlanService seatingPlanService) {
        this.seatingPlanService = seatingPlanService;
    }

    @GetMapping("/session/{sessionId}")
    public List<SeatingPlan> getBySession(@PathVariable Long sessionId) {
        return seatingPlanService.getSeatingPlanByExamSession(sessionId);
    }
}
