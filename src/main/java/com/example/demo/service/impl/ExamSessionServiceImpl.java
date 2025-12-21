package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.ExamSessionService;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository repo;
    private final StudentRepository studentRepo;

    public ExamSessionServiceImpl(ExamSessionRepository repo, StudentRepository studentRepo) {
        this.repo = repo;
        this.studentRepo = studentRepo;
    }

    @Override
    public ExamSession createSession(ExamSession session) {
        return repo.save(session);
    }

    @Override
    public ExamSession getSession(Long sessionId) {
        return repo.findById(sessionId).orElse(null);
    }
}
