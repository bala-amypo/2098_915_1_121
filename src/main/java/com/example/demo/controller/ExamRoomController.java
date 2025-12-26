package com.example.demo.controller;

import com.example.demo.model.ExamRoom;
import com.example.demo.service.ExamRoomService;

public class ExamRoomController {

    public ExamRoomController(ExamRoomService s){}
    public ExamRoomController(){}

    public ExamRoom add(ExamRoom r){ return r; }
}
