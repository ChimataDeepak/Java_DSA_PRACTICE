package arrayProblems;

import java.util.*;

public class SumOfArrayElements {

    public static void main(String[] args) {

        {

            int arr[] = {5, 4, 3, 2, 1};

            int n = arr.length;

            int sum1 = 0;
            for (int j : arr) {
                sum1 = sum1 + j;
            }
            System.out.println("Sum of array elements is: " + sum1);
        }

    }

        public static void sumOfArrayElementsDynamic(String[] args) {

            // 1. Create a Scanner object to read what the user types
            Scanner scanner = new Scanner(System.in);

            // 2. Ask the user for the size of the array
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            // 3. Initialize the array using the size 'n' provided by the user
            int[] arr = new int[n];

            // 4. Loop 'n' times to take elements from the user
            System.out.println("Please enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                // Read the next number typed and put it in the array at index 'i'
                arr[i] = scanner.nextInt();
            }

            // --- Just to prove it worked, let's print the array out ---
            System.out.print("The array you built is: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println(); // Print a blank line for neatness

            // 5. Finally, find and print the length of the array at the end
            System.out.println("The length of the array at the end is: " + arr.length);

            // It is good practice to close the scanner when you are completely done with it
            scanner.close();
        }

}

