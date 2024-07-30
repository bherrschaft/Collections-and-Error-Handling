import java.util.ArrayList;  // Import ArrayList class
import java.util.HashSet;    // Import HashSet class
import java.util.List;       // Import List interface
import java.util.Set;        // Import Set interface

public class CollectionsAndErrorHandling {
    public static void main(String[] args) {
        try {
            // Define a list of integers with duplicates
            List<Integer> integers = new ArrayList<>();
            integers.add(1);
            integers.add(2);
            integers.add(3);
            integers.add(2);
            integers.add(4);
            integers.add(3);
            integers.add(5);

            // Print the original list
            System.out.println("Original list: " + integers);

            // Remove duplicates using a Set
            Set<Integer> uniqueIntegers = new HashSet<>(integers);

            // Print the list without duplicates
            System.out.println("List without duplicates: " + uniqueIntegers);

            // Calculate the sum and average
            int sum = calculateSum(uniqueIntegers);
            double average = calculateAverage(uniqueIntegers);

            // Print the sum and average
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }

    // Method to calculate the sum of a collection of integers
    public static int calculateSum(Set<Integer> integers) {
        int sum = 0;
        for (int num : integers) {
            sum += num;  // Add each integer to the sum
        }
        return sum;  // Return the sum
    }

    // Method to calculate the average of a collection of integers
    public static double calculateAverage(Set<Integer> integers) {
        if (integers.isEmpty()) {
            throw new IllegalArgumentException("The set is empty");
        }
        int sum = calculateSum(integers);  // Calculate the sum of the integers
        return (double) sum / integers.size();  // Calculate and return the average
    }
}
