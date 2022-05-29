import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double allMoneySaved = 0;

            while (neededMoney > allMoneySaved) {
                double saveSum = Double.parseDouble(scanner.nextLine());
                allMoneySaved = allMoneySaved + saveSum;

            }
            System.out.printf("Going to %s!%n", input);
            input = scanner.nextLine();
        }
    }
}
