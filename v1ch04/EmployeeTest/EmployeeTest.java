import java.time.*;

/**
 * This program tests the Employee class.
 * 
 * @version 1.13 2018-04-10
 * @author Cay Horstmann
 */
public class EmployeeTest {
   public static void main(String[] args) {
      // fill the staff array with three Employee objects
      var staff = new Employee[4];

      Manager cto = new Manager("Benjamin Alamu", 120000, 2024, 05, 11);
      cto.setBonus(5000);
      staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
      staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
      staff[3] = cto;

      // raise everyone's salary by 5%
      for (Employee e : staff)
         e.raiseSalary(5);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
               + e.getHireDay());
   }
}

class Employee {
   private String name;
   private double salary;
   private LocalDate hireDay;

   public Employee(String n, double s, int year, int month, int day) {
      name = n;
      salary = s;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public LocalDate getHireDay() {
      return hireDay;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}

class Manager extends Employee {
   private double bonus;

   public Manager(String name, double salary, int year, int month, int day) {
      super(name, salary, year, month, day);
      bonus = 0;
   }

   public double getBonus() {
      return bonus;
   }

   public void setBonus(double newBonus) {
      bonus = newBonus;
   }

   public double getSalary() {
      double baseSalary = super.getSalary();
      return baseSalary + this.bonus;
   }
}