package Arrays.PracticalArrays;

import java.util.Scanner; // Import Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Ask user for the number of days they want to input temperatures for
        System.out.print("Enter the number of temperature readings: ");
        int numDays = scanner.nextInt(); // Read user input for number of days
        int[] temps = new int[numDays]; // Create an array to store temperatures

        int sum = 0; // Variable to store sum of all temperatures

        // Loop to take temperature input from the user
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = scanner.nextInt(); // Store user input in array
            sum += temps[i]; // Add current temperature to sum
        }

        // Calculate the average temperature (convert sum to double to avoid integer division)
        double average = (double) sum / numDays;

        int above = 0; // Counter for number of days above average temperature

        // Loop to count how many days have a temperature above the average
        for (int temp : temps) { // Enhanced for-loop for readability
            if (temp > average) {
                above++; // Increment count if temperature is above average
            }
        }

        // Display the results
        System.out.println("\nAverage Temperature = " + average);
        System.out.println(above + " day(s) above average");

        scanner.close(); // Close the scanner to free system resources
    }
}
