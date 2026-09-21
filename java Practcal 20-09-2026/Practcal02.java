import java.util.Scanner;

public class Practcal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even/Odd status of each element:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Element " + arr[i] + " is Even");
            } else {
                System.out.println("Element " + arr[i] + " is Odd");
            }
        }

        sc.close();
    }
}
