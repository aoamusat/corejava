package com.hexcore.todo;

/**
 * Represents an employee with attributes such as name, role, department, and
 * salary.
 * This class provides methods to retrieve and update employee details and to
 * handle salary adjustments.
 */
public class Employee {
    private String name; // The name of the employee.
    private String role; // The role or job title of the employee.
    private String department; // The department in which the employee works.
    private double salary; // The employee's salary.

    /**
     * Default constructor that initializes an employee with default values.
     * Name, role, and department are set to empty strings, and salary is set to
     * 0.0.
     */
    public Employee() {
        this.name = "";
        this.role = "";
        this.department = "";
        this.salary = 0.0;
    }

    /**
     * Parameterized constructor to initialize an employee with specific details.
     *
     * @param name       the name of the employee
     * @param role       the role or job title of the employee
     * @param department the department of the employee
     * @param salary     the salary of the employee
     */
    public Employee(String name, String role, String department, double salary) {
        this.name = name.trim();
        this.role = role.trim();
        this.department = department.trim();
        this.salary = salary;
    }

    /**
     * Retrieves the name of the employee.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the name of the employee.
     *
     * @param name the new name for the employee
     */
    public void setName(String name) {
        this.name = name.trim();
    }

    /**
     * Retrieves the role of the employee.
     *
     * @return the role of the employee
     */
    public String getRole() {
        return role;
    }

    /**
     * Updates the role of the employee.
     *
     * @param role the new role for the employee
     */
    public void setRole(String role) {
        this.role = role.trim();
    }

    /**
     * Retrieves the department of the employee.
     *
     * @return the department of the employee
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Updates the department of the employee.
     *
     * @param department the new department for the employee
     */
    public void setDepartment(String department) {
        this.department = department.trim();
    }

    /**
     * Retrieves the salary of the employee.
     *
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Updates the salary of the employee.
     *
     * @param newSalary the new salary for the employee
     * @throws IllegalArgumentException if the new salary is negative
     */
    public void setSalary(double newSalary) throws IllegalArgumentException {
        if (newSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = newSalary;
    }

    /**
     * Increases the salary of the employee by a specified percentage.
     *
     * @param percent the percentage by which to increase the salary
     * @throws IllegalArgumentException if the percentage is negative
     */
    public void raiseSalary(double percent) throws IllegalArgumentException {
        if (percent < 0) {
            throw new IllegalArgumentException("Raise percentage cannot be negative");
        }
        this.salary += this.salary * (percent / 100);
    }

    /**
     * Returns a string representation of the employee's basic details.
     *
     * @return a string representing the employee
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
