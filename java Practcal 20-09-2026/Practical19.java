import java.util.Scanner;

public class Practical19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        double[][] marks = new double[5][5];
        double[] total = new double[5];
        double[] percentage = new double[5];
        String[] grade = new String[5];
        String[] result = new String[5];

        System.out.println("Enter details of 5 students:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.println("Enter marks of 5 subjects for " + names[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextDouble();
                total[i] += marks[i][j];
            }
            sc.nextLine();

            percentage[i] = (total[i] / 500) * 100;

            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "F";
            }

            if (percentage[i] >= 40) {
                result[i] = "Pass";
            } else {
                result[i] = "Fail";
            }
        }

        System.out.println("\nStudent Performance Report");
        System.out.println("Name\tMarks\tPercentage\tGrade\tResult");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t" + total[i] + "\t" + String.format("%.2f", percentage[i]) + "%\t" + grade[i] + "\t" + result[i]);
        }

        int highestIndex = 0;
        int lowestIndex = 0;
        double classTotal = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < 5; i++) {
            classTotal += percentage[i];

            if (percentage[i] > percentage[highestIndex]) {
                highestIndex = i;
            }
            if (percentage[i] < percentage[lowestIndex]) {
                lowestIndex = i;
            }

            if (result[i].equals("Pass")) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double classAverage = classTotal / 5;

        System.out.println("\nHighest scorer: " + names[highestIndex] + " (" + String.format("%.2f", percentage[highestIndex]) + "%)");
        System.out.println("Lowest scorer: " + names[lowestIndex] + " (" + String.format("%.2f", percentage[lowestIndex]) + "%)");
        System.out.println("Class average: " + String.format("%.2f", classAverage) + "%");
        System.out.println("Number of passed students: " + passCount);
        System.out.println("Number of failed students: " + failCount);

        sc.close();
    }
}
