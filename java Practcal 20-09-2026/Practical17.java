import java.util.Scanner;

public class Practical17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array:");
        for (int i = 9; i >= 0; i--) {
            if (arr[i] == 0) {
                System.out.println("ZERO");
            } else if (arr[i] < 0) {
                System.out.println("NEGATIVE");
            } else if (arr[i] % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }
    }
}
