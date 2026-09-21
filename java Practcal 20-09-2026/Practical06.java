import java.util.Scanner;

public class Practical06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];

        System.out.println("Enter marks of 10 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 40) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("\nHighest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
        System.out.println("Average marks: " + average);
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);

        sc.close();
    }
}
