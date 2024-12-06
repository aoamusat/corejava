import java.util.*;

/**
 * This program demonstrates console input.
 * 
 * @version 1.11 2023-08-26
 * @author Cay Horstmann
 */
public class InputTest {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {

         // get first input
         System.out.print("What is your name? ");
         String name = input.nextLine();

         // get second input
         System.out.print("How old are you? ");
         int age = input.nextInt();

         // display output on console
         System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1) + ".");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }

   }
}
