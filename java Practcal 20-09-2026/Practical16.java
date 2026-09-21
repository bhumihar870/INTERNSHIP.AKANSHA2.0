import java.util.Scanner;

public class Practical16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];

        System.out.println("Enter marks of 10 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + i + " marks: ");
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int highestIndex = 0;
        int lowestIndex = 0;
        int sum = 0;

        int above75 = 0;
        int range60to74 = 0;
        int range40to59 = 0;
        int failed = 0;

        for (int i = 0; i < marks.length; i++) {
            int mark = marks[i];
            sum += mark;

            if (mark > highest) {
                highest = mark;
                highestIndex = i;
            }
            if (mark < lowest) {
                lowest = mark;
                lowestIndex = i;
            }

            if (mark >= 75) {
                above75++;
            } else if (mark >= 60 && mark <= 74) {
                range60to74++;
            } else if (mark >= 40 && mark <= 59) {
                range40to59++;
            } else {
                failed++;
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("\nResults:");
        System.out.println("Highest marks: " + highest + " at student index " + highestIndex);
        System.out.println("Lowest marks: " + lowest + " at student index " + lowestIndex);
        System.out.println("Average marks: " + average);
        System.out.println("Number of students scoring >= 75: " + above75);
        System.out.println("Number of students scoring 60-74: " + range60to74);
        System.out.println("Number of students scoring 40-59: " + range40to59);
        System.out.println("Number of failed students: " + failed);

        sc.close();
    }
}
