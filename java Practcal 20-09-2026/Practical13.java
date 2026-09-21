import java.util.Scanner;

public class Practical13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];

        int positiveEven = 0, positiveOdd = 0, negativeEven = 0, negativeOdd = 0, zero = 0;

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    positiveEven++;
                } else {
                    positiveOdd++;
                }
            } else {
                if (arr[i] % 2 == 0) {
                    negativeEven++;
                } else {
                    negativeOdd++;
                }
            }
        }

        System.out.println("Positive Even: " + positiveEven);
        System.out.println("Positive Odd: " + positiveOdd);
        System.out.println("Negative Even: " + negativeEven);
        System.out.println("Negative Odd: " + negativeOdd);
        System.out.println("Zero: " + zero);

        sc.close();
    }
}
