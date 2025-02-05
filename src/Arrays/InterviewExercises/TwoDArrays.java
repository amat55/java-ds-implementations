package Arrays.InterviewExercises;

public class TwoDArrays {

    /*
        Given 2D array calculate the sum of diagonal elements.

            Example

            myArray2D= {{1,2,3},{4,5,6},{7,8,9}};

            sumDiagonalElements(myArray2D) # 15
     */


    public static void main(String[] args) {
        // Test cases
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // Expected output: 1 + 5 + 9 = 15

        int[][] singleElementMatrix = {
                {7}
        }; // Expected output: 7

        int[][] nonSquareMatrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        }; // Expected output: Error: Not a square matrix

        int[][] emptyMatrix = {}; // Expected output: 0

        // Running test cases
        System.out.println("Diagonal Sum: " + sumDiagonalElements(squareMatrix));
        System.out.println("Diagonal Sum: " + sumDiagonalElements(singleElementMatrix));
        System.out.println("Diagonal Sum: " + sumDiagonalElements(nonSquareMatrix)); // Should return 0
        System.out.println("Diagonal Sum: " + sumDiagonalElements(emptyMatrix)); // Should return 0
    }

    // Method to sum the diagonal elements of a square matrix
    public static int sumDiagonalElements(int[][] array) {
        // Edge case: If array is null or empty
        if (array == null || array.length == 0) {
            return 0;
        }

        int numRows = array.length;

        // Check if all rows have the same length (to ensure it's a square matrix)
        for (int[] row : array) {
            if (row.length != numRows) {
                System.out.println("Error: Not a square matrix");
                return 0; // Return 0 instead of proceeding
            }
        }

        int sum = 0;
        for (int i = 0; i < numRows; i++) {
            sum += array[i][i]; // Summing diagonal elements
        }

        return sum;
    }

}
