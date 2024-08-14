import java.util.ArrayList;  // Import ArrayList class for creating a dynamic array
import java.util.HashSet;    // Import HashSet class for creating a set to remove duplicates
import java.util.List;       // Import List interface to define a list of integers
import java.util.Set;        // Import Set interface to define a set of unique integers

public class CollectionsAndErrorHandling {
    public static void main(String[] args) {
        try {
            // Define a list of integers with duplicates
            List<Integer> integers = new ArrayList<>();  // Create a new ArrayList of integers
            integers.add(1);  // Add integer 1 to the list
            integers.add(2);  // Add integer 2 to the list
            integers.add(3);  // Add integer 3 to the list
            integers.add(2);  // Add duplicate integer 2 to the list
            integers.add(4);  // Add integer 4 to the list
            integers.add(3);  // Add duplicate integer 3 to the list
            integers.add(5);  // Add integer 5 to the list

            // Print the original list
            System.out.println("Original list: " + integers);  // Display the list with duplicates

            // Remove duplicates using a Set
            Set<Integer> uniqueIntegers = new HashSet<>(integers);  // Create a HashSet to remove duplicates from the list

            // Print the list without duplicates
            System.out.println("List without duplicates: " + uniqueIntegers);  // Display the set with unique integers

            // Calculate the sum and average
            int sum = calculateSum(uniqueIntegers);  // Calculate the sum of the unique integers
            double average = calculateAverage(uniqueIntegers);  // Calculate the average of the unique integers

            // Print the sum and average
            System.out.println("Sum: " + sum);  // Output the sum of the integers
            System.out.println("Average: " + average);  // Output the average of the integers

        } catch (IllegalArgumentException | ArithmeticException e) {
            // Catch block for handling IllegalArgumentException or ArithmeticException
            System.out.println("An error occurred: " + e.getMessage());  // Print the error message
        } catch (IndexOutOfBoundsException e) {
            // Catch block for handling IndexOutOfBoundsException
            System.out.println("Index out of bounds: " + e.getMessage());  // Print the error message
        } finally {
            // Finally block always executes, used for cleanup or final actions
            System.out.println("Operation completed.");  // Print that the operation is complete
        }
    }

    // Method to calculate the sum of a collection of integers
    public static int calculateSum(Set<Integer> integers) {
        int sum = 0;  // Initialize sum to 0
        for (int num : integers) {  // Iterate over each integer in the set
            sum += num;  // Add each integer to the sum
        }
        return sum;  // Return the calculated sum
    }

    // Method to calculate the average of a collection of integers
    public static double calculateAverage(Set<Integer> integers) {
        if (integers.isEmpty()) {  // Check if the set is empty
            throw new IllegalArgumentException("The set is empty");  // Throw an exception if the set is empty
        }
        int sum = calculateSum(integers);  // Calculate the sum of the integers
        return (double) sum / integers.size();  // Calculate and return the average
    }
}

/*
 * Summary:
 * The CollectionsAndErrorHandling class demonstrates how to work with collections in Java, specifically with Lists and Sets.
 * It also includes basic error handling using try-catch blocks. The program removes duplicates from a list of integers by converting it to a set, 
 * then calculates and prints the sum and average of the unique integers. If the set is empty, or an arithmetic error occurs, 
 * appropriate exceptions are thrown and handled. Finally, a message is printed to confirm the completion of the operation.
 */

