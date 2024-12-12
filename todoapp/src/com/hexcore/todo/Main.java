package com.hexcore.todo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hexcore Todo App");
        String taskDescription = """
                Create a Todo App Controller class that manages a list of Todo tasks.
                The controller should have the following methods:
                1. Add a new Todo task
                2. Remove a Todo task
                3. Update the expiry date of a Todo task
                4. Mark a Todo task as completed
                5. List all Todo tasks
                6. List all expired Todo tasks
                7. Search for Todo tasks by title or description
                8. Save the Todo tasks to a file
                9. Load Todo tasks from a file
                10. Implement command-line interface (CLI) for the Todo App Controller
                """;
        LocalDate expDate = LocalDate.now().plusDays(7);
        var todo = new TodoItem("Write Todo App Controller", taskDescription, expDate);
        System.out.println("Todo: " + todo);
    }
}