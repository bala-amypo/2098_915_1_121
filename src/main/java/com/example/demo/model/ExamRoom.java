package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exam_room")
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String roomNumber;

    @Column(name = "row_count", nullable = false)
    private int rows;

    @Column(name = "col_count", nullable = false)
    private int columns;

    @Column(nullable = false)
    private int capacity;

    public ExamRoom() {}

    // ===== REQUIRED GETTERS / SETTERS =====

    public Long getId() { return id; }

    // 🔥 REQUIRED BY TESTS
    public void setId(Long id) { this.id = id; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public int getRows() { return rows; }
    public void setRows(int rows) { this.rows = rows; }

    public int getColumns() { return columns; }
    public void setColumns(int columns) { this.columns = columns; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    // 🔥 REQUIRED BY TESTS
    public void ensureCapacityMatches() {
        this.capacity = this.rows * this.columns;
    }

    // ===== BUILDER (TESTS USE THIS A LOT) =====

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final ExamRoom r = new ExamRoom();

        public Builder id(Long id) {
            r.setId(id);
            return this;
        }

        public Builder roomNumber(String roomNumber) {
            r.setRoomNumber(roomNumber);
            return this;
        }

        public Builder rows(int rows) {
            r.setRows(rows);
            return this;
        }

        public Builder columns(int columns) {
            r.setColumns(columns);
            return this;
        }

        public Builder capacity(int capacity) {
            r.setCapacity(capacity);
            return this;
        }

        public ExamRoom build() {
            return r;
        }
    }
}
