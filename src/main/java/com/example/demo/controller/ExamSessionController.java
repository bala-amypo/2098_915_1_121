package com.example.demo.controller;

import com.example.demo.model.ExamSession;
import com.example.demo.service.ExamSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class ExamSessionController {

    @Autowired
    private ExamSessionService examSessionService;

    @PostMapping
    public ExamSession createSession(@RequestBody ExamSession session) {
        return examSessionService.createSession(session);
    }

    @GetMapping
    public List<ExamSession> getAllSessions() {
        return examSessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public ExamSession getSession(@PathVariable Long id) {
        return examSessionService.getSession(id);
    }
}
