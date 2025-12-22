package com.example.demo.controller;

import com.example.demo.entity.ExamSession;
import com.example.demo.service.ExamSessionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessions")
public class ExamSessionController {

    private final ExamSessionService sessionService;

    public ExamSessionController(ExamSessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping
    public ExamSession createSession(@RequestBody ExamSession session) {
        return sessionService.saveSession(session);
    }
}
