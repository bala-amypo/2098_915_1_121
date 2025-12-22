package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.model.Student;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository repo;

    public ExamSessionServiceImpl(ExamSessionRepository repo) {
        this.repo = repo;
    }

    @Override
    public ExamSession saveSession(ExamSession session) {
        if (session.getStudents() != null) {
            for (Student s : session.getStudents()) {
                s.setExamSession(session);
            }
        }
        return repo.save(session);
    }
}
