package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seating-plans")
public class SeatingPlanController {

    @Autowired
    private SeatingPlanService service;

    @PostMapping("/{sessionId}")
    public SeatingPlan generate(@PathVariable Long sessionId) {
        return service.generatePlan(sessionId);
    }

    @GetMapping("/{sessionId}")
    public SeatingPlan get(@PathVariable Long sessionId) {
        return service.getPlan(sessionId);
    }

    @GetMapping
    public List<SeatingPlan> getAll() {
        return service.getAllPlans();
    }
}
