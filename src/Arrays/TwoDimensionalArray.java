package Arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    // Declare a 2D array
    int arr[][] = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        // Instantiate the 2D array with the given number of rows and columns
        this.arr = new int[numberOfRows][numberOfColumns];
        // Initialize all elements to Integer.MIN_VALUE
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            // Check if the specified position is empty (contains Integer.MIN_VALUE)
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value; // Insert the value
                System.out.println("Value Inserted!");
            } else {
                System.out.println("Already Occupied!"); // Position already has a value
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Array!"); // Handle invalid index access
        }
    }

    public void outputArray() {

    }

    public void deleteValue() {

    }

    public void accessValue(int value) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value found " + value);
                    return;
                }
            }
        }
        System.out.println("Value is not found!");

    }

    public static void main(String[] args) {
        // Declare
        int[][] int2DArray;
        // Instantiate
        int2DArray = new int[2][2];
        // Initialize
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 3;
        int2DArray[1][0] = 5;
        int2DArray[1][1] = 7;
        // Print the 2D array in a readable format
        System.out.println(Arrays.deepToString(int2DArray));

        System.out.println();

        TwoDimensionalArray myArray = new TwoDimensionalArray(2, 2);
        myArray.insertValueInTheArray(0, 0, 10);
        myArray.insertValueInTheArray(0, 1, 23);
        myArray.insertValueInTheArray(1, 0, 5);
        myArray.insertValueInTheArray(1, 1, 53);

        System.out.println(Arrays.deepToString(myArray.arr));

        System.out.println();
        myArray.accessValue(100);
    }
}
