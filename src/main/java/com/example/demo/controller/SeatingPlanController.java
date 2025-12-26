package com.example.demo.controller;

import com.example.demo.entity.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seating-plans")
public class SeatingPlanController {

    private final SeatingPlanService service;

    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public SeatingPlan get(@PathVariable Long id) {
        SeatingPlan plan = new SeatingPlan();
        plan.setId(id);
        return plan;
    }

    @GetMapping
    public List<SeatingPlan> list(@RequestParam Long sessionId) {
        return List.of();
    }
}
