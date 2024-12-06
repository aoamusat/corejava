import java.math.BigInteger;

public class Formulas {

    public static final double PI_VALUE = Math.PI;

    enum Weekdays {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    };

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    public static double absoluteValue(double number) {
        return Math.abs(number);
    }

    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}