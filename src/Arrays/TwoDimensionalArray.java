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
        // Loop through the 2D array and print each element
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[0].length; row++) { // Use arr[0].length to iterate columns correctly
                System.out.println(arr[col][row]);
            }
        }
    }


    public void deleteValue(int col, int row) {
        try {
            // Set the specified position back to Integer.MIN_VALUE (mark as empty)
            arr[col][row] = Integer.MIN_VALUE;
            System.out.println("Data deleted!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!"); // Handle invalid index access
        }
    }


    public void searchValue(int value) {
        // Loop through the 2D array to find the specified value
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value found: " + value + " at row " + row + ", column " + col);
                    return; // Exit the method once the value is found
                }
            }
        }
        System.out.println("Value is not found!"); // Value is not in the array
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

        // Insert values into the 2D array
        myArray.insertValueInTheArray(0, 0, 10);
        myArray.insertValueInTheArray(0, 1, 23);
        myArray.insertValueInTheArray(1, 0, 5);
        myArray.insertValueInTheArray(1, 1, 53);

        // Print the entire 2D array
        System.out.println(Arrays.deepToString(myArray.arr));

        System.out.println();

        // Search for a value in the array (100 is not present)
        myArray.searchValue(10);

        System.out.println();

        // Delete a value at row 0, column 1
        myArray.deleteValue(0, 1);

        System.out.println();

        // Print the array after deletion
        myArray.outputArray();

    }
}
