package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ExamRoom {

    @Id
    @GeneratedValue
    private Long id;

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

    public void ensureCapacityMatches() {
        this.capacity = rows * columns;
    }

    public static Builder builder(){ return new Builder(); }

    public static class Builder {
        private final ExamRoom r = new ExamRoom();
        public Builder roomNumber(String n){ r.setRoomNumber(n); return this; }
        public Builder rows(int v){ r.setRows(v); return this; }
        public Builder columns(int v){ r.setColumns(v); return this; }
        public Builder capacity(int v){ r.setCapacity(v); return this; }
        public ExamRoom build(){ return r; }
    }
}
