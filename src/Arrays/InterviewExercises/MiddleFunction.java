package Arrays.InterviewExercises;

public class MiddleFunction {

    /*
    Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

        myArray = [1, 2, 3, 4]
        middle(myArray)  # [2,3].
     */

    public static void main(String[] args) {
        // Test arrays
        int[] array1 = {1, 2, 3, 4, 5};  // Expected output: [2, 3, 4]
        int[] array2 = {10, 20, 30};     // Expected output: [20]
        int[] array3 = {7, 8};           // Expected output: []
        int[] array4 = {42};             // Expected output: []
        int[] array5 = {};               // Expected output: []

        // Run tests
        System.out.println("Middle Elements:");
        printArray(middle(array1));
        printArray(middle(array2));
        printArray(middle(array3));
        printArray(middle(array4));
        printArray(middle(array5));
    }

    public static int[] middle(int[] array) {
        // If the array has less than 2 elements, return an empty array
        if (array.length < 2) {
            return new int[0];
        }

        // Create a new array to hold the middle elements (excluding first and last)
        int[] middleArray = new int[array.length - 2];

        // Use a for-loop for better readability
        for (int i = 1; i < array.length - 1; i++) {
            middleArray[i - 1] = array[i]; // Copy middle elements
        }

        return middleArray;
    }

    // Helper method to print arrays
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
