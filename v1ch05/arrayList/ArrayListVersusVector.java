import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListVersusVector {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> integerVector = new Vector<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            integerVector.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("It took %d milliseconds to add 2,000,000 elements to a vector%n", (endTime - startTime));

        List<Integer> integerArrayList = new ArrayList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.printf("It took %d milliseconds to add 2,000,000 elements to an ArrayList%n", (endTime - startTime));

        // Thread-safe ArrayList
        List<Integer> synchronizedArrayList = Collections.synchronizedList(new ArrayList<>());

        // Using threads for vector and synchronized ArrayList
        Thread threadOne = new Thread(() -> {
            for (int i = 0; i < 2000000; i++) {
                integerVector.add(i);
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 2000000; i++) {
                integerArrayList.add(i);
            }
        });

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.printf("Final length of integer vector: %d%n", integerVector.size());
        System.out.printf("Final length of synchronized ArrayList: %d%n", integerArrayList.size());
    }
}
