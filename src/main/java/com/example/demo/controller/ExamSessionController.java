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
    private ExamSessionService service;

    @PostMapping
    public ExamSession create(@RequestBody ExamSession session) {
        return service.createSession(session);
    }

    @GetMapping("/{id}")
    public ExamSession get(@PathVariable Long id) {
        return service.getSession(id);
    }

    @GetMapping
    public List<ExamSession> getAll() {
        return service.getAllSessions();
    }
}
