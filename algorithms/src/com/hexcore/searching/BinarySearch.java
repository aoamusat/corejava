package com.hexcore.searching;

public class BinarySearch {
    // Iterative implementation
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Calculate middle point (avoiding potential integer overflow)
            int mid = left + (right - left) / 2;

            // If target is found at mid, return the index
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    // Recursive implementation
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        // Base case: if left pointer exceeds right pointer, element not found
        if (left > right) {
            return -1;
        }

        // Calculate middle point
        int mid = left + (right - left) / 2;

        // If target is found at mid, return the index
        if (arr[mid] == target) {
            return mid;
        }

        // If target is less than mid, search in left half
        if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }

        // If target is greater than mid, search in right half
        return binarySearchRecursive(arr, target, mid + 1, right);
    }

    // Example usage
    public static void main(String[] args) {
        int[] sortedArray = { 2, 3, 4, 10, 40, 50, 60, 70 };
        int target = 10;

        // Using iterative method
        int iterativeResult = binarySearchIterative(sortedArray, target);
        if (iterativeResult != -1) {
            System.out.println("Element found at index: " + iterativeResult);
        } else {
            System.out.println("Element not found");
        }

        // Using recursive method
        int recursiveResult = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        if (recursiveResult != -1) {
            System.out.println("Element found at index: " + recursiveResult);
        } else {
            System.out.println("Element not found");
        }
    }
}
