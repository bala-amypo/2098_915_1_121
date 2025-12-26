package com.example.demo.model;

public class ExamRoom {
    private long id;
    private String roomNumber;
    private int rows;
    private int columns;
    private int capacity;

    public ExamRoom() {}

    public static ExamRoom builder() {
        return new ExamRoom();
    }

    public ExamRoom id(long id) {
        this.id = id;
        return this;
    }

    public ExamRoom roomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public ExamRoom rows(int rows) {
        this.rows = rows;
        return this;
    }

    public ExamRoom columns(int columns) {
        this.columns = columns;
        return this;
    }

    public ExamRoom capacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public ExamRoom build() {
        return this;
    }

    public void ensureCapacityMatches() {
        this.capacity = this.rows * this.columns;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public int getRows() { return rows; }
    public void setRows(int rows) { this.rows = rows; }

    public int getColumns() { return columns; }
    public void setColumns(int columns) { this.columns = columns; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
