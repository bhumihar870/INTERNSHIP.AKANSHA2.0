import java.util.Scanner;

public class Practical08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("All even numbers:");
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                evenCount++;
                evenSum += numbers[i];
            }
        }

        System.out.println();
        System.out.println("All odd numbers:");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
                oddCount++;
                oddSum += numbers[i];
            }
        }

        System.out.println();
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        sc.close();
    }
}
