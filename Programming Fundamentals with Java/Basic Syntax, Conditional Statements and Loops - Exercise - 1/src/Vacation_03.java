import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double sum = 0;
        if (groupType.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                sum = peopleCount * 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                sum = peopleCount * 9.80;

            } else if (dayOfWeek.equals("Sunday")) {
                sum = peopleCount * 10.46;

            }
            if (peopleCount >= 30) {
                sum = sum * 0.85;

            }
        } else if (groupType.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                sum = peopleCount * 10.90;
            } else if (dayOfWeek.equals("Saturday")) {
                sum = peopleCount * 15.60;

            } else if (dayOfWeek.equals("Sunday")) {
                sum = peopleCount * 16;

            }
            if (peopleCount >= 100) {
                double priceFor10People = sum / peopleCount;
                sum = sum - (priceFor10People * 10);
            }
        } else if (groupType.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                sum = peopleCount * 15;
            } else if (dayOfWeek.equals("Saturday")) {
                sum = peopleCount * 20;

            } else if (dayOfWeek.equals("Sunday")) {
                sum = peopleCount * 22.50;

            }
            if (peopleCount >= 10 && peopleCount <= 20) {
                sum = sum * 0.95;

            }
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
