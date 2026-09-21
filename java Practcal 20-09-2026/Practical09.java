import java.util.Scanner;

public class Practical09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = (double) total / marks.length;
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        boolean allPassed = true;
        for (int mark : marks) {
            if (mark < 40) {
                allPassed = false;
                break;
            }
        }

        System.out.println("\nTotal marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        if (allPassed) {
            System.out.println("Result: Passed all subjects.");
        } else {
            System.out.println("Result: Failed one or more subjects.");
        }

        sc.close();
    }
}
