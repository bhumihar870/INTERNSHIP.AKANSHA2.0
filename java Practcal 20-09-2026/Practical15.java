import java.util.Scanner;

public class Practical15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[10];
        System.out.println("\nDuplicate elements with their frequency:");

        for (int i = 0; i < 10; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println("Element " + arr[i] + " occurs " + count + " times.");
            }
            visited[i] = true;
        }

        sc.close();
    }
}
