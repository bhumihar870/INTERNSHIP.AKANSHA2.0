import java.util.Scanner;

public class Practical01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.println("Enter marks in Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.println("Enter marks in Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.println("Enter marks in Subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        int percentage = total / 3;

        boolean passed = sub1 >= 33 && sub2 >= 33 && sub3 >= 33;

        System.out.println("\nStudent Result");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (passed) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        sc.close();
    }
}
