import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author <a href="mailto:aoamusat@gmail.com">aoamusat@gmail.com</a>
 * @version 1.0.1
 * 
 *          This class contains a list of all the users' input
 */
public class UserDB {
    private final static ArrayList<String> userList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the username input system.");
        System.out.println("================================================");

        Scanner commandScanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPress 1 to add a user to the list");
            System.out.println("Press 2 to display users from the list");
            System.out.println("Press 3 to quit");
            System.out.print("\nPlease enter a command: ");

            // Validate input
            if (!commandScanner.hasNextInt()) {
                System.err.println("Invalid input. Please enter a number.");
                commandScanner.next(); // Consume invalid input
                continue;
            }

            int command = commandScanner.nextInt();

            switch (command) {
                case 1:
                    addUsername(commandScanner);
                    break;
                case 2:
                    displayUserList();
                    break;
                case 3:
                    quitApplication();
                    break;
                default:
                    System.err.println("Invalid command. Please try again.");
            }
        }
    }

    private static void addUsername(Scanner scanner) {
        System.out.print("Enter a username: ");
        scanner.nextLine(); // Consume newline left by nextInt()
        String username = scanner.nextLine();

        if (userList.contains(username)) {
            System.out.println("\nUsername already exists. Please try another.");
        } else {
            userList.add(username);
            System.out.println("\nUsername added successfully.");
        }
    }

    private static void quitApplication() {
        System.out.println("\nThank you for using the application.");
        System.exit(0);
    }

    private static void displayUserList() {
        if (userList.isEmpty()) {
            System.out.println("No users in the list.");
        } else {
            System.out.println("\nUser List:");
            for (String username : userList) {
                System.out.println("- " + username);
            }
        }
    }
}
