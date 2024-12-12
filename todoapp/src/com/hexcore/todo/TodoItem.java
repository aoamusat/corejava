package com.hexcore.todo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class TodoItem {
    private String title;
    private String description;
    private LocalDate expiryDate;

    public TodoItem(String title, String description, LocalDate expiryDate) {
        this.title = title;
        this.description = description;
        this.expiryDate = expiryDate;
    }

    public boolean expired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    public String getTitle() {
        return title;
    }

    public String getExpiryDate() {
        return expiryDate.format(DateTimeFormatter.ofPattern("d MMM uuuu"));
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void updateExpiryDate(LocalDate newDate) throws IllegalArgumentException {
        if (newDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Expiry date cannot be in the past");
        }
        this.expiryDate = newDate;
    }
}