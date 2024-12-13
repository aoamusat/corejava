package com.hexcore.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * This class contains a static method to sort an integer array using the
 * Selection Sort algorithm.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 500);
        }

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts the given integer array using the Selection Sort algorithm.
     *
     * <p>
     * The Selection Sort algorithm works by repeatedly finding the minimum element
     * from the unsorted part of the array and placing it at the beginning. This
     * process
     * is repeated until the entire array is sorted.
     *
     * @param numbers The array to be sorted.
     *
     * @return This function does not return a value. It modifies the input array
     *         in-place.
     */
    private static void sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            int min = numbers[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
        }
    }

    /**
     * Swaps the elements at the specified indices in the given integer array.
     *
     * @param numbers The array in which to swap elements.
     * @param i       The index of the first element to swap.
     * @param j       The index of the second element to swap.
     *
     * @return This function does not return a value. It modifies the input array
     *         in-place.
     */
    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
