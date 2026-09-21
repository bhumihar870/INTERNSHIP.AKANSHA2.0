import java.util.Scanner;

public class Practical18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all elements");
            System.out.println("2. Find largest");
            System.out.println("3. Find smallest");
            System.out.println("4. Calculate sum");
            System.out.println("5. Calculate average");
            System.out.println("6. Count even numbers");
            System.out.println("7. Count odd numbers");
            System.out.println("8. Search an element");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int largest = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > largest) {
                            largest = arr[i];
                        }
                    }
                    System.out.println("Largest element: " + largest);
                    break;

                case 3:
                    int smallest = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < smallest) {
                            smallest = arr[i];
                        }
                    }
                    System.out.println("Smallest element: " + smallest);
                    break;

                case 4:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum of elements: " + sum);
                    break;

                case 5:
                    int total = 0;
                    for (int i = 0; i < n; i++) {
                        total += arr[i];
                    }
                    double average = (double) total / n;
                    System.out.println("Average: " + average);
                    break;

                case 6:
                    int evenCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) {
                            evenCount++;
                        }
                    }
                    System.out.println("Count of even numbers: " + evenCount);
                    break;

                case 7:
                    int oddCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 != 0) {
                            oddCount++;
                        }
                    }
                    System.out.println("Count of odd numbers: " + oddCount);
                    break;

                case 8:
                    System.out.print("Enter the element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 9:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 9.");
            }
        } while (choice != 9);

        sc.close();
    }
}
