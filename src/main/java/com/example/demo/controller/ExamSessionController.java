package com.example.demo.controller;

import com.example.demo.model.ExamSession;
import com.example.demo.service.ExamSessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class ExamSessionController {

    private final ExamSessionService examSessionService;

    public ExamSessionController(ExamSessionService examSessionService) {
        this.examSessionService = examSessionService;
    }

    @GetMapping
    public List<ExamSession> getAll() {
        return examSessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public ExamSession getById(@PathVariable Long id) {
        return examSessionService.getSession(id);
    }

    @PostMapping
    public void create(@RequestBody ExamSession session) {
        examSessionService.saveSession(session);   // <-- use saveSession
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        examSessionService.deleteSession(id);
    }
}
