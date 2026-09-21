import java.util.Scanner;

public class Practical11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        int positiveSum = 0, negativeSum = 0;
        StringBuilder positiveNumbers = new StringBuilder();
        StringBuilder negativeNumbers = new StringBuilder();
        StringBuilder zeroNumbers = new StringBuilder();

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
                positiveSum += num;
                positiveNumbers.append(num).append(" ");
            } else if (num < 0) {
                negativeCount++;
                negativeSum += num;
                negativeNumbers.append(num).append(" ");
            } else {
                zeroCount++;
                zeroNumbers.append(num).append(" ");
            }
        }

        System.out.println("\nPositive numbers: " + positiveNumbers.toString().trim());
        System.out.println("Negative numbers: " + negativeNumbers.toString().trim());
        System.out.println("Zeros: " + zeroNumbers.toString().trim());

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        System.out.println("Sum of positive numbers: " + positiveSum);
        System.out.println("Sum of negative numbers: " + negativeSum);

        sc.close();
    }
}
