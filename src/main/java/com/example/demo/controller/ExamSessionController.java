package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ExamSession;
import com.example.demo.service.ExamSessionService;

@RestController
@RequestMapping("/api/sessions")
public class ExamSessionController {

    private final ExamSessionService service;

    public ExamSessionController(ExamSessionService service) {
        this.service = service;
    }

    @PostMapping
    public ExamSession create(@RequestBody ExamSession session) {
        return service.save(session);
    }

    @GetMapping("/{id}")
    public ExamSession get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<ExamSession> getAll() {
        return service.getAll();
    }
}
