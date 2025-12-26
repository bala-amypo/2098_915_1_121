package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exam_room")
public class ExamRoom {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String roomNumber;

    private int rows;
    private int columns;
    private int capacity;

    public ExamRoom() {}

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getRoomNumber(){ return roomNumber; }
    public void setRoomNumber(String roomNumber){ this.roomNumber = roomNumber; }

    public int getRows(){ return rows; }
    public void setRows(int rows){ this.rows = rows; }

    public int getColumns(){ return columns; }
    public void setColumns(int columns){ this.columns = columns; }

    public int getCapacity(){ return capacity; }
    public void setCapacity(int capacity){ this.capacity = capacity; }

    public static Builder builder(){ return new Builder(); }

    public static class Builder {
        private final ExamRoom r = new ExamRoom();
        public Builder id(Long id){ r.setId(id); return this; }
        public Builder roomNumber(String n){ r.setRoomNumber(n); return this; }
        public Builder rows(int rws){ r.setRows(rws); return this; }
        public Builder columns(int c){ r.setColumns(c); return this; }
        public Builder capacity(int c){ r.setCapacity(c); return this; }
        public ExamRoom build(){ return r; }
    }
}
