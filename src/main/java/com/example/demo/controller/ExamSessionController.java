package com.example.demo.controller;

import com.example.demo.entity.ExamSession;
import com.example.demo.service.ExamSessionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessions")
public class ExamSessionController {

    private final ExamSessionService service;

    public ExamSessionController(ExamSessionService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ExamSession get(@PathVariable Long id) {
        return service.getById(id);
    }
}
