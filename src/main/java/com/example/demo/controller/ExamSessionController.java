package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ExamSession;
import com.example.demo.service.ExamSessionService;

@RestController
@RequestMapping("/sessions")
public class ExamSessionController {

    private final ExamSessionService examSessionService;

    public ExamSessionController(ExamSessionService examSessionService) {
        this.examSessionService = examSessionService;
    }

    @PostMapping
    public ExamSession create(@RequestBody ExamSession session) {
        return examSessionService.createSession(session);
    }

    @GetMapping("/{id}")
    public ExamSession get(@PathVariable Long id) {
        return examSessionService.getSession(id);
    }
}
