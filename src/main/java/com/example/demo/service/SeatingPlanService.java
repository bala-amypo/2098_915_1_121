package com.example.demo.service;

import java.util.List;
import com.example.demo.model.SeatingPlan;

public interface SeatingPlanService {
    SeatingPlan generate(Long sessionId, Long roomId);
    SeatingPlan getById(Long id);
    List<SeatingPlan> getBySession(Long sessionId);
}
