package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository examSessionRepository;

    // Constructor injection (no @Autowired needed)
    public ExamSessionServiceImpl(ExamSessionRepository examSessionRepository) {
        this.examSessionRepository = examSessionRepository;
    }

    @Override
    public List<ExamSession> getAllSessions() {
        return examSessionRepository.findAll();
    }

    @Override
    public ExamSession getSessionById(Long id) {
        return examSessionRepository.findById(id).orElse(null);
    }

    @Override
    public void saveSession(ExamSession session) {
        examSessionRepository.save(session);
    }

    @Override
    public void deleteSession(Long id) {
        examSessionRepository.deleteById(id);
    }

    // Example usage of getStudents() & getExamDate()
    public void printSessionInfo(Long id) {
        ExamSession session = getSessionById(id);
        if (session != null) {
            System.out.println("Exam Date: " + session.getExamDate());
            System.out.println("Students: " + session.getStudents());
        }
    }
}
