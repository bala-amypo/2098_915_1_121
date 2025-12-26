package com.example.demo.service.impl;

import com.example.demo.entity.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    @Override
    public SeatingPlan generatePlan(Long sessionId, Long roomId) {
        SeatingPlan plan = new SeatingPlan();
        plan.setSessionId(sessionId);
        plan.setRoomId(roomId);
        return plan;
    }
}
