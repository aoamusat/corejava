/**
 * This program demonstrates static methods.
 * 
 * @version 1.03 2021-09-03
 * @author Cay Horstmann
 */
public class StaticTest {
   public static void main(String[] args) {
      // fill the staff array with three Employee objects
      var staff = new Employee[3];

      var lexusRX350 = new Lexus(VehicleType.SUV, 2020, "RX 350H", TransmissionType.Automatic);

      System.out.println(lexusRX350.toString());

      staff[0] = new Employee("Tom", 40000);
      staff[1] = new Employee("Dick", 60000);
      staff[2] = new Employee("Harry", 65000);

      // print out information about all Employee objects
      for (Employee e : staff) {
         System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
               + e.getSalary());
      }

      int n = Employee.advanceId(); // calls static method
      System.out.println("Next issued id=" + n);
   }
}

class Employee {
   private static int nextId = 1;

   private String name;
   private double salary;
   private int id;

   public Employee(String n, double s) {
      name = n;
      salary = s;
      id = advanceId();
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public int getId() {
      return id;
   }

   public static int advanceId() {
      int r = nextId; // obtain next available id
      nextId++;
      return r;
   }

   public static void main(String[] args) // runs demo
   {
      var e = new Employee("Harry", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
   }
}

class Vehicle {
   private VehicleType type;
   private TransmissionType transmissionType;

   public Vehicle(VehicleType t, TransmissionType tt) {
      this.type = t;
      this.transmissionType = tt;
   }

   public VehicleType getType() {
      return type;
   }

   public TransmissionType getTransmissionType() {
      return transmissionType;
   }

   public String toString() {
      return String.format("Vehicle <type: %s | transmission: %s>", type.toString(), transmissionType.toString());
   }
}

class Lexus extends Vehicle {
   private int year;
   private String model;

   public Lexus(VehicleType vType, int year, String model, TransmissionType tt) {
      super(vType, tt);
      this.year = year;
      this.model = model;
   }

   public int getYear() {
      return year;
   }

   public String getModel() {
      return model;
   }
}
