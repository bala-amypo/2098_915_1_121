package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;

@RestController
@RequestMapping("/api/seating-plans")
public class SeatingPlanController {

    private final SeatingPlanService service;

    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    @PostMapping("/generate")
    public SeatingPlan generate(@RequestParam Long sessionId,
                                @RequestParam Long roomId) {
        return service.generate(sessionId, roomId);
    }

    @GetMapping("/{id}")
    public SeatingPlan get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/session/{sessionId}")
    public List<SeatingPlan> getBySession(@PathVariable Long sessionId) {
        return service.getBySession(sessionId);
    }
}
