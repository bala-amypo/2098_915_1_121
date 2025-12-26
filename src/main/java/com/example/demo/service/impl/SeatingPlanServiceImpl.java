package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;

import java.util.List;

public class SeatingPlanServiceImpl implements SeatingPlanService {

    public SeatingPlanServiceImpl() {}

    public SeatingPlanServiceImpl(ExamSessionRepository s,
                                  SeatingPlanRepository p,
                                  ExamRoomRepository r) {}

    @Override
    public SeatingPlan generatePlan(Long sessionId) {
        return new SeatingPlan();
    }

    @Override
    public SeatingPlan getPlan(Long id) {
        return new SeatingPlan();
    }

    @Override
    public List<SeatingPlan> getPlansBySession(Long sessionId) {
        return List.of();
    }
}
