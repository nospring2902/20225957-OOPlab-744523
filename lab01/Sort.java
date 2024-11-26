import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store the numbers
        int[] array = new int[size];

        // Get the array elements from the user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the average value
        double average = (double) sum / size;

        // Output the sorted array, sum, and average
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average Value of Array Elements: " + average);
    }
}

