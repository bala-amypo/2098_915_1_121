package com.example.demo.service.impl;

import com.example.demo.entity.ExamSession;
import com.example.demo.entity.Student;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository sessionRepository;

    public ExamSessionServiceImpl(ExamSessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public ExamSession saveSession(ExamSession session) {
        if (session.getStudents() != null) {
            for (Student student : session.getStudents()) {
                student.setExamSession(session);
            }
        }
        return sessionRepository.save(session);
    }
}
