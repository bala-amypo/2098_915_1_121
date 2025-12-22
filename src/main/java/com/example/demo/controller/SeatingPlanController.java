package com.example.demo.controller;

import com.example.demo.entity.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seating-plans")
public class SeatingPlanController {

    private final SeatingPlanService seatingPlanService;

    public SeatingPlanController(SeatingPlanService seatingPlanService) {
        this.seatingPlanService = seatingPlanService;
    }

    @PostMapping
    public SeatingPlan create(@RequestBody SeatingPlan seatingPlan) {
        return seatingPlanService.save(seatingPlan);
    }
}
