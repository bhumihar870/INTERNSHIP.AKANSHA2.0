import java.util.Scanner;

public class Practical14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int count = 0;
        int firstIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number exists.");
            System.out.println("First position/index: " + firstIndex);
            System.out.println("Number of times it occurs: " + count);
        } else {
            System.out.println("The number does not exist in the array.");
        }

        sc.close();
    }
}
