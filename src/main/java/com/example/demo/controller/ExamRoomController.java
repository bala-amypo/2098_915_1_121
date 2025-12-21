package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ExamRoom;
import com.example.demo.service.ExamRoomService;

@RestController
@RequestMapping("/rooms")
public class ExamRoomController {

    private final ExamRoomService examRoomService;

    public ExamRoomController(ExamRoomService examRoomService) {
        this.examRoomService = examRoomService;
    }

    @PostMapping
    public ExamRoom add(@RequestBody ExamRoom room) {
        return examRoomService.addRoom(room);
    }

    @GetMapping
    public List<ExamRoom> getAll() {
        return examRoomService.getAllRooms();
    }
}
