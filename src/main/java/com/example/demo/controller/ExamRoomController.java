package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ExamRoom;
import com.example.demo.service.ExamRoomService;

@RestController
@RequestMapping("/api/rooms")
public class ExamRoomController {

    private final ExamRoomService service;

    public ExamRoomController(ExamRoomService service) {
        this.service = service;
    }

    @PostMapping
    public ExamRoom create(@RequestBody ExamRoom room) {
        return service.save(room);
    }

    @GetMapping("/{id}")
    public ExamRoom get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<ExamRoom> getAll() {
        return service.getAll();
    }
}
