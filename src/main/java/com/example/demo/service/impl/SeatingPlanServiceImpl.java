package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.ExamRoom;
import com.example.demo.model.ExamSession;
import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository planRepository;
    private final ExamSessionRepository sessionRepository;
    private final ExamRoomRepository roomRepository;

    public SeatingPlanServiceImpl(SeatingPlanRepository planRepository,
                                  ExamSessionRepository sessionRepository,
                                  ExamRoomRepository roomRepository) {
        this.planRepository = planRepository;
        this.sessionRepository = sessionRepository;
        this.roomRepository = roomRepository;
    }

    public SeatingPlan generatePlan(Long sessionId, Long roomId) {
        ExamSession session = sessionRepository.findById(sessionId)
                .orElseThrow(() -> new ApiException("session not found", 404));

        ExamRoom room = roomRepository.findById(roomId)
                .orElseThrow(() -> new ApiException("no room", 404));

        if (session.getStudents().size() > room.getCapacity()) {
            throw new ApiException("no room", 400);
        }

        String json = "{\"students\":" + session.getStudents().size() + "}";

        SeatingPlan plan = new SeatingPlan(session, room, json);
        return planRepository.save(plan);
    }

    public List<SeatingPlan> getPlansBySession(Long sessionId) {
        return planRepository.findByExamSessionId(sessionId);
    }
}
