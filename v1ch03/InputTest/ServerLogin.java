import java.io.Console;
import java.util.*;

public class ServerLogin {
    public static void main(String[] args) {
        try {
            Console systemConsole = System.console();
            String username = systemConsole.readLine("Enter your username: ");
            char[] password = systemConsole.readPassword("Enter your password: ");

            Arrays.fill(password, '*');

            StringBuilder s = new StringBuilder();
            s.append("Username: ").append(username).append("\n");
            s.append("Password: ").append(new String(password)).append("\n");

            System.err.println(s.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
