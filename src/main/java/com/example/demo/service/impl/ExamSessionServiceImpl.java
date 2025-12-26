package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private ExamSessionRepository sessionRepo;
    private StudentRepository studentRepo;

    // ✅ REQUIRED by Spring
    public ExamSessionServiceImpl() {}

    // ✅ REQUIRED by tests
    public ExamSessionServiceImpl(ExamSessionRepository sessionRepo,
                                  StudentRepository studentRepo) {
        this.sessionRepo = sessionRepo;
        this.studentRepo = studentRepo;
    }

    @Override
    public ExamSession createSession(ExamSession session) {
        return sessionRepo.save(session);
    }

    @Override
    public ExamSession getSession(Long id) {
        return sessionRepo.findById(id).orElse(null);
    }

    @Override
    public List<ExamSession> getAllSessions() {
        return sessionRepo.findAll();
    }
}
