import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(search + " occurs " + count + " times");
        } else {
            System.out.println(search + " does not occur in the array");
        }

        sc.close();
    }
}
