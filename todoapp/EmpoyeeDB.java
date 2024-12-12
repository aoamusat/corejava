import java.util.HashMap;
import java.util.Map;

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
