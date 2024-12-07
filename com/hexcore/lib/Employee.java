package com.hexcore.lib;

public class Employee {
    private String name;
    private String role;
    private String department;
    private double salary;

    public Employee() {
        this.name = "";
        this.role = "";
        this.department = "";
        this.salary = 0.0;
    }

    public Employee(String name, String role, String department, double salary) {
        this.name = name;
        this.role = role;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        role = role.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department.trim();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) throws IllegalArgumentException {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        salary = newSalary;
    }

    public void raiseSalary(double percent) throws IllegalArgumentException {
        if (percent < 0) {
            throw new IllegalArgumentException("Raise percentage cannot be negative");
        }

        this.salary += this.salary * (percent / 100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
