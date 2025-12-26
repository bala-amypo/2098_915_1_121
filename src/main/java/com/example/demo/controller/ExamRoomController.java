package com.example.demo.controller;

import com.example.demo.entity.ExamRoom;
import com.example.demo.service.ExamRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class ExamRoomController {

    private final ExamRoomService service;

    public ExamRoomController(ExamRoomService service) {
        this.service = service;
    }

    @GetMapping
    public List<ExamRoom> list() {
        return service.getAll();
    }
}
