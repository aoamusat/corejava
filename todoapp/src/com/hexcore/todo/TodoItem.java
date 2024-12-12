package com.hexcore.todo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a single todo item with essential attributes and management
 * capabilities.
 * 
 * This class encapsulates the core details of a task or todo item, including
 * its title,
 * description, and expiry date. It provides methods for checking expiration
 * status,
 * retrieving item details, and updating task information.
 * 
 * <p>
 * Key Features:
 * <ul>
 * <li>Tracks title, description, and expiry date for a todo item</li>
 * <li>Supports checking if an item has expired</li>
 * <li>Provides getter and setter methods for item attributes</li>
 * <li>Includes validation for expiry date updates</li>
 * </ul>
 * </p>
 * 
 * <p>
 * Usage Example:
 * 
 * <pre>
 * LocalDate futureDate = LocalDate.now().plusDays(7);
 * TodoItem task = new TodoItem("Complete Project", "Finish development", futureDate);
 * 
 * // Check if task is expired
 * boolean isExpired = task.expired();
 * 
 * // Update task description
 * task.setDescription("Finalize project documentation");
 * </pre>
 * </p>
 * 
 * @author Akeem
 * @version 1.0
 * @since 2024-12-12
 */
class TodoItem {
    private String title; // The title of the to-do item.
    private String description; // A detailed description of the to-do item.
    private LocalDate expiryDate; // The date when the to-do item expires.

    /**
     * Constructs a new {@code TodoItem} with the specified title, description, and
     * expiry date.
     *
     * @param title       the title of the to-do item
     * @param description a description of the to-do item
     * @param expiryDate  the expiry date of the to-do item
     * @throws NullPointerException if any parameter is {@code null}
     */
    public TodoItem(String title, String description, LocalDate expiryDate) {
        if (title == null || description == null || expiryDate == null) {
            throw new NullPointerException("Title, description, and expiry date cannot be null");
        }
        this.title = title;
        this.description = description;
        this.expiryDate = expiryDate;
    }

    /**
     * Checks if the to-do item has expired.
     *
     * @return {@code true} if the current date is after the expiry date,
     *         {@code false} otherwise
     */
    public boolean expired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    /**
     * Retrieves the title of the to-do item.
     *
     * @return the title of the to-do item
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves the expiry date of the to-do item as a formatted string.
     *
     * @return the formatted expiry date in the format "d MMM uuuu" (e.g., "20 Dec
     *         2024")
     */
    public String getExpiryDate() {
        return expiryDate.format(DateTimeFormatter.ofPattern("d MMM uuuu"));
    }

    /**
     * Retrieves the description of the to-do item.
     *
     * @return the description of the to-do item
     */
    public String getDescription() {
        return description;
    }

    /**
     * Updates the description of the to-do item.
     *
     * @param description the new description for the to-do item
     * @throws NullPointerException if {@code description} is {@code null}
     */
    public void setDescription(String description) {
        if (description == null) {
            throw new NullPointerException("Description cannot be null");
        }
        this.description = description;
    }

    /**
     * Updates the title of the to-do item.
     *
     * @param title the new title for the to-do item
     * @throws NullPointerException if {@code title} is {@code null}
     */
    public void setTitle(String title) {
        if (title == null) {
            throw new NullPointerException("Title cannot be null");
        }
        this.title = title;
    }

    /**
     * Updates the expiry date of the to-do item.
     *
     * @param newDate the new expiry date
     * @throws IllegalArgumentException if {@code newDate} is in the past
     * @throws NullPointerException     if {@code newDate} is {@code null}
     */
    public void updateExpiryDate(LocalDate newDate) {
        if (newDate == null) {
            throw new NullPointerException("Expiry date cannot be null");
        }
        if (newDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Expiry date cannot be in the past");
        }
        this.expiryDate = newDate;
    }
}
