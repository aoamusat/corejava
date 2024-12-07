import java.util.*;

public class ArraySorting {
    public static void main(String[] args) {
        char[] a = new char[] { 'a', 'b', 'c', 'd', 'e', 'f' };
        String[] myArray = new String[] { "Akeem", "Yinka", "John", "Echezona", "Benjamin", "Samuel", "Adeoye" };
        System.out.printf("Array before sorting: %s\n", Arrays.toString(myArray));
        Arrays.sort(myArray); // Sorting array in ascending order
        System.out.printf("Array after sorting: %s\n", Arrays.toString(myArray));
    }
}
