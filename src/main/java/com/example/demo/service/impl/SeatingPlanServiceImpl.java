package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    @Override
    public List<SeatingPlan> getAll() {
        return List.of();
    }
}
