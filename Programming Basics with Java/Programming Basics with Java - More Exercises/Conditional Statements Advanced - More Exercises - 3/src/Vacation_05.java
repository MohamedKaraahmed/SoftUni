import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String accommodation = "";
        double sum = 0;
        if (budget <= 1000) {

            if (season.equals("Summer")) {
                accommodation = "Camp";
                location = "Alaska";
                sum = budget * 0.65;

            } else if (season.equals("Winter")) {
                accommodation = "Camp";
                location = "Morocco";
                sum = budget * 0.45;
            }

        } else if (budget <= 3000) {

            if (season.equals("Summer")) {
                accommodation = "Hut";
                location = "Alaska";
                sum = budget * 0.80;
            } else if (season.equals("Winter")) {
                accommodation = "Hut";
                location = "Morocco";
                sum = budget * 0.60;
            }

        } else {

            if (season.equals("Summer")) {
                accommodation = "Hotel";
                location = "Alaska";
                sum = budget * 0.90;
            } else if (season.equals("Winter")) {
                accommodation = "Hotel";
                location = "Morocco";
                sum = budget * 0.90;
            }

        }
        System.out.printf("%s - %s - %.2f", location, accommodation, sum);
    }

}
