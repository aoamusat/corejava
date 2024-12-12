package com.hexcore.todo;

import java.util.HashMap;
import java.util.Map;

/**
 * EmpoyeeDB is a class that simulates a simple database for storing and
 * managing employee records.
 * It provides methods to retrieve an employee by their ID, retrieve all
 * employees, and update an employee's salary.
 * The database is represented by a HashMap where the key is the employee's ID
 * (Integer) and the value is the Employee object.
 *
 * <p>
 * This class includes a constructor that initializes the database with sample
 * employee data and the following methods:
 * <ul>
 * <li><b>getEmployeeById(int id):</b> Returns the employee object associated
 * with the given ID. Returns null if the ID does not exist in the
 * database.</li>
 * <li><b>getAllEmployees():</b> Returns a new HashMap containing all employees
 * stored in the database.</li>
 * <li><b>updateEmployeeSalary(int id, double newSalary):</b> Updates the salary
 * of the employee with the given ID. Throws an IllegalArgumentException if the
 * employee with the given ID does not exist.</li>
 * </ul>
 * 
 * <p>
 * Example usage:
 * 
 * <pre>
 * EmpoyeeDB db = new EmpoyeeDB();
 * Employee employee = db.getEmployeeById(1);
 * db.updateEmployeeSalary(1, 50000);
 * </pre>
 */
public class EmpoyeeDB {
    private final Map<Integer, Employee> employees;

    public EmpoyeeDB() {
        employees = new HashMap<Integer, Employee>();
        employees.put(1, new Employee("John", "Backend Engineer", "Engineering", 45000));
        employees.put(2, new Employee("Jane", "Frontend Developer", "Engineering", 50000));
        employees.put(3, new Employee("Bob", "Project Manager", "Management", 60000));
        employees.put(4, new Employee("Alice", "Software Architect", "Engineering", 65000));
        employees.put(5, new Employee("David", "Data Scientist", "Research", 70000));
        employees.put(6, new Employee("Emily", "Product Manager", "Management", 55000));
        employees.put(7, new Employee("Michael", "DevOps Engineer", "Engineering", 55000));
        employees.put(8, new Employee("Sarah", "Senior Software Engineer", "Engineering", 65000));
    }

    public Employee getEmployeeById(int id) {
        return employees.get(id); // Returns null if the ID is not found
    }

    // Method to get all employees
    public Map<Integer, Employee> getAllEmployees() {
        return new HashMap<>(employees); // Return a copy of the map
    }

    public void updateEmployeeSalary(int id, double newSalary) {
        Employee employee = employees.get(id);
        if (employee != null) {
            employee.setSalary(newSalary);
        } else {
            throw new IllegalArgumentException("Employee with ID " + id + " not found.");
        }
    }
}
