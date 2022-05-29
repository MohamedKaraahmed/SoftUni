import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0;
        double water = 20;
        double internet = 15;
        double other = 0;

        for (int i = 1; i <= months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricity += electricityBill;
            other += (electricityBill + water + internet) +
                    ((electricityBill + water + internet) * 0.20);
        }
        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water * months);
        System.out.printf("Internet: %.2f lv%n", internet * months);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv", (electricity + (water * months) + (internet * months) + other) / months);
    }
}
