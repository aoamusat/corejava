import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(Path.of("/Users/wovenadmin/Desktop/query.txt"),
                StandardCharsets.UTF_8)) {
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }
}
