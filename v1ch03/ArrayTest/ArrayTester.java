import java.util.*;

public class ArrayTester {
    public static void main(String[] args) {
        try {
            double[] scores = new double[10];
            int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
            User[] users = new User[] {
                    new User("test_user1", "secret_1"),
                    new User("test_user2", "secret_2"),
                    new User("test_user3", "secret_3"),
                    new User("test_user4", "secret_4"),
                    new User("test_user5", "secret_5"),
                    new User("test_user6", "secret_6"),
                    new User("test_user7", "secret_7"),
                    new User("test_user8", "secret_8"),
                    new User("test_user9", "secret_9"),
                    new User("test_user10", "secret_10"),
                    new User("test_user11", "secret_11"),
                    new User("test_user12", "secret_12"),
                    new User("test_user13", "secret_13"),
                    new User("test_user14", "secret_14"),
                    new User("test_user15", "secret_15"),
            };

            System.out.println("Printing out user information");

            // Multidimensional array
            int[][] matrix = new int[][] {
                    { 1, 2, 3, },
                    { 4, 5, 6, },
                    { 7, 8, 9, }
            };

            for (User user : users) {
                System.out.printf("User information for user <%s>: %s\n", user.getUsername(), user.getPassword());
            }

            for (var prime : smallPrimes) {
                System.out.printf("Prime %d x PI = %.6f\n", prime, (double) (prime * Math.PI));
            }

            for (int i = 0; i < 20; i++) {
                scores[i] = Math.PI * (double) (i);
            }

            for (var score : scores) {
                System.out.println(score);
            }
        } catch (Exception e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
