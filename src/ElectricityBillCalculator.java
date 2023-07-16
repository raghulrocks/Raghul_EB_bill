import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = s.nextInt();

        double totalBill = calculateBill(units);

        System.out.println("Electricity Bill: Rs. " + totalBill);
    }

    public static double calculateBill(int units) {
        double totalBill;

        if (units<= 100) {
            totalBill = units * 1.50;
        } else if (units <= 200) {
            totalBill = 100 * 1.50 + (units - 100) * 2.50;
        } else if (units <= 500) {
            totalBill = 100 * 1.50 + 100 * 2.50 + (units - 200) * 4.00;
        } else {
            totalBill = 100 * 1.50 + 100 * 2.50 + 300 * 4.00 + (units - 500) * 6.00;
        }

        return totalBill;
    }
}
