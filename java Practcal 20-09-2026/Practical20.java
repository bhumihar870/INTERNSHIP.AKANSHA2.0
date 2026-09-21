import java.util.Scanner;

public class Practical20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] units = new int[10];

        System.out.println("Enter electricity units consumed by 10 customers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Customer " + (i + 1) + ": ");
            units[i] = sc.nextInt();
        }

        System.out.println("\nCustomer No. | Units | Bill | Category");

        double highestBill = 0;
        double lowestBill = Double.MAX_VALUE;
        double totalRevenue = 0;
        int moreThan300 = 0;

        for (int i = 0; i < 10; i++) {
            int u = units[i];
            double bill;
            String category;

            if (u <= 100) {
                bill = u * 2.0;
                category = "0-100";
            } else if (u <= 200) {
                bill = u * 3.0;
                category = "101-200";
            } else if (u <= 300) {
                bill = u * 5.0;
                category = "201-300";
            } else {
                bill = u * 7.0;
                category = "Above 300";
                moreThan300++;
            }

            totalRevenue += bill;
            if (bill > highestBill) highestBill = bill;
            if (bill < lowestBill) lowestBill = bill;

            System.out.printf("%d | %d | ₹%.2f | %s%n", i + 1, u, bill, category);
        }

        System.out.println("\nHighest bill: ₹" + highestBill);
        System.out.println("Lowest bill: ₹" + lowestBill);
        System.out.println("Total revenue: ₹" + totalRevenue);
        System.out.println("Number of customers consuming more than 300 units: " + moreThan300);

        sc.close();
    }
}
