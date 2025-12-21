package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seating-plans")
public class SeatingPlanController {

    private final SeatingPlanService seatingPlanService;

    public SeatingPlanController(SeatingPlanService seatingPlanService) {
        this.seatingPlanService = seatingPlanService;
    }

    @GetMapping("/exam/{id}")
    public List<SeatingPlan> getSeatingPlansByExamSession(@PathVariable("id") Long examSessionId) {
        return seatingPlanService.getSeatingPlansByExamSessionId(examSessionId);
    }
}
