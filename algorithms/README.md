# Java Sorting and Searching Algorithms

This project implements common sorting and searching algorithms in Java, providing both iterative and recursive solutions where applicable.

The repository contains implementations of selection sort and binary search algorithms. These implementations serve as educational examples and can be used as reference implementations for understanding the algorithms' behavior and performance characteristics.

## Repository Structure

```
.
└── algorithms
    ├── docs
    │   └── ... (JavaDoc documentation files)
    └── src
        └── com
            └── hexcore
                ├── searching
                │   └── BinarySearch.java
                └── sorting
                    └── SelectionSort.java
```

### Key Files:

- `algorithms/src/com/hexcore/searching/BinarySearch.java`: Contains the implementation of the binary search algorithm.
- `algorithms/src/com/hexcore/sorting/SelectionSort.java`: Contains the implementation of the selection sort algorithm.

## Usage Instructions

### Installation

1. Ensure you have Java Development Kit (JDK) installed on your system. This project is compatible with Java 8 and above.
2. Clone the repository to your local machine:
   ```
   git clone <repository-url>
   ```
3. Navigate to the project directory:
   ```
   cd algorithms
   ```

### Compiling the Code

To compile the Java files, run the following command from the `algorithms` directory:

```
javac src/com/hexcore/searching/*.java src/com/hexcore/sorting/*.java
```

### Running the Examples

Each algorithm implementation includes a `main` method with example usage. To run these examples:

1. For Binary Search:
   ```
   java -cp src com.hexcore.searching.BinarySearch
   ```

2. For Selection Sort:
   ```
   java -cp src com.hexcore.sorting.SelectionSort
   ```

### Using the Algorithms in Your Code

To use these algorithms in your own Java projects:

1. Copy the desired Java file(s) into your project's source directory.
2. Import the class in your Java file:
   ```java
   import com.hexcore.searching.BinarySearch;
   // or
   import com.hexcore.sorting.SelectionSort;
   ```
3. Use the static methods provided by each class:

   ```java
   // Binary Search example
   int[] sortedArray = {2, 3, 4, 10, 40};
   int target = 10;
   int result = BinarySearch.binarySearchIterative(sortedArray, target);
   
   // Selection Sort example
   int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};
   SelectionSort.sort(unsortedArray);
   ```

### Testing & Quality

While this project doesn't include formal unit tests, you can verify the correctness of the algorithms by running the example code provided in each class's `main` method. These examples demonstrate the basic functionality of each algorithm.

### Troubleshooting

Common issues and their solutions:

1. **ClassNotFoundException**:
   - Problem: Java can't find the class file.
   - Solution: Ensure you're running the java command from the correct directory and that the class path (-cp) is set correctly.

2. **Unexpected sorting or searching results**:
   - Problem: The algorithm isn't producing the expected output.
   - Solution: Double-check that the input array is in the correct format (e.g., sorted for binary search) and that you're interpreting the output correctly.

3. **Performance issues with large datasets**:
   - Problem: The algorithms are running slowly on large arrays.
   - Solution: These implementations are for educational purposes and may not be optimized for very large datasets. Consider using Java's built-in sorting and searching methods for production use with large datasets.

## Data Flow

The data flow for both algorithms is straightforward:

1. Input: An array of integers is provided to the algorithm.
2. Processing: The algorithm manipulates or searches the array according to its logic.
3. Output: The algorithm returns the result (sorted array for Selection Sort, index or -1 for Binary Search).

```
[Input Array] -> [Algorithm Processing] -> [Output Result]
```

For Binary Search:
```
[Sorted Array, Target] -> [Binary Search Algorithm] -> [Index of Target or -1]
```

For Selection Sort:
```
[Unsorted Array] -> [Selection Sort Algorithm] -> [Sorted Array]
```

Note: Binary Search requires a pre-sorted array as input to function correctly.