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


    }
}
