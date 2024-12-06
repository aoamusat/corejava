
public class MathTest {

    public static void main(String[] args) {
        // Calculate the factorial of 5
        for (int i = 0; i < 300; i++) {
            System.out.printf("Factorial of %d is: %s\n", i + 1, Formulas.factorial(i + 1));
        }
    }
}
