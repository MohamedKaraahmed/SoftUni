import java.util.Scanner;

public class HairSalon_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//cel za denq, da postigne tolkova pari
        int goalForToday = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        boolean isReached = false;
        String input = scanner.nextLine();
        while (!input.equals("closed")) {
            if (input.equals("haircut")) {
                String haircutKind = scanner.nextLine();
                if (haircutKind.equals("mens")) {
                    totalSum = totalSum + 15;
                } else if (haircutKind.equals("ladies")) {
                    totalSum = totalSum + 20;
                } else if (haircutKind.equals("kids")) {
                    totalSum = totalSum + 10;
                }
            } else if (input.equals("color")) {
                String colorKind = scanner.nextLine();
                if (colorKind.equals("touch up")) {
                    totalSum = totalSum + 20;
                } else if (colorKind.equals("full color")) {
                    totalSum = totalSum + 30;
                }
            }
            if (totalSum >= goalForToday) {
//                System.out.printf("You have reached your target for the day!%n");
//                System.out.printf("Earned money: %.0flv.", totalSum);
                isReached = true;
                break;
            }
            input = scanner.nextLine();

        }
        if (isReached) {
            System.out.printf("You have reached your target for the day!%n");
            System.out.printf("Earned money: %.0flv.", totalSum);
        } else {
            double diff = Math.abs(goalForToday - totalSum);
            System.out.printf("Target not reached! You need %.0flv. more.%n", diff);
            System.out.printf("Earned money: %.0flv.", totalSum);
        }
    }
}
