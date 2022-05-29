import java.util.Scanner;

public class Pets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int kgFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double catFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double turtleFoorPerDayGrams = Double.parseDouble(scanner.nextLine());

        double totalNeededFood = (dogFoodPerDayKg * daysCount) + (catFoodPerDayKg * daysCount) + ((turtleFoorPerDayGrams / 1000) * daysCount);

        if (totalNeededFood <= kgFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(kgFood - totalNeededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalNeededFood - kgFood));
        }
    }
}
