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
package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository repository;

    public ExamSessionServiceImpl(ExamSessionRepository repository) {
        this.repository = repository;
    }

    public ExamSession createSession(ExamSession session) {
        if (session.getStudents() == null || session.getStudents().isEmpty()) {
            throw new ApiException("at least 1 student", 400);
        }
        return repository.save(session);
    }

    public List<ExamSession> getAllSessions() {
        return repository.findAll();
    }

    public ExamSession getSessionById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ApiException("session not found", 404));
    }
}
