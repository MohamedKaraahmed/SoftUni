import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double palamudSum = palamudKg * (mackerelPrice * 1.60);
        double safridSum = safridKg * (cacaPrice * 1.80);
        double musselsSum = musselsKg * 7.50;
        double finalSum = palamudSum + safridSum + musselsSum;
        System.out.printf("%.2f", finalSum);
    }
}
