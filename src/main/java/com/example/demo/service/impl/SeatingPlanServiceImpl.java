package com.example.demo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.SeatingPlanService;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final ExamSessionRepository sessionRepo;
    private final SeatingPlanRepository planRepo;
    private final ExamRoomRepository roomRepo;

    public SeatingPlanServiceImpl(
            ExamSessionRepository sessionRepo,
            SeatingPlanRepository planRepo,
            ExamRoomRepository roomRepo) {

        this.sessionRepo = sessionRepo;
        this.planRepo = planRepo;
        this.roomRepo = roomRepo;
    }

    @Override
    public SeatingPlan generatePlan(Long sessionId) {
        ExamSession session = sessionRepo.findById(sessionId).orElse(null);
        if (session == null) return null;

        ExamRoom room = roomRepo.findAll().stream().findFirst().orElse(null);
        if (room == null) return null;

        SeatingPlan plan = new SeatingPlan(null, session, room, "{}");
        return planRepo.save(plan);
    }

    @Override
    public SeatingPlan getPlan(Long planId) {
        return planRepo.findById(planId).orElse(null);
    }

    @Override
    public List<SeatingPlan> getPlansBySession(Long sessionId) {
        return planRepo.findByExamSessionId(sessionId);
    }
}
