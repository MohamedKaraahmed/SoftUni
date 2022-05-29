import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classType = "";
        String carType = "";
        double totalSum = 0;
        if (budget <= 100) {
            if (season.equals("Summer")) {
                classType = "Economy class";
                carType = "Cabrio";
                budget = budget * 0.35;
            } else if (season.equals("Winter")) {
                classType = "Economy class";
                carType = "Jeep";
                budget = budget * 0.65;
            }

        } else if (budget <= 500) {
            if (season.equals("Summer")) {
                classType = "Compact class";
                carType = "Cabrio";
                budget = budget * 0.45;
            } else if (season.equals("Winter")) {
                classType = "Compact class";
                carType = "Jeep";
                budget = budget * 0.80;
            }

        } else if (budget > 500) {
            if (season.equals("Summer")) {
                classType = "Luxury class";
                carType = "Jeep";
                budget = budget * 0.90;
            } else if (season.equals("Winter")) {
                classType = "Luxury class";
                carType = "Jeep";
                budget = budget * 0.90;
            }
        }
        System.out.printf("%s%n", classType);
        System.out.printf("%s - %.2f", carType, budget);

    }
}
