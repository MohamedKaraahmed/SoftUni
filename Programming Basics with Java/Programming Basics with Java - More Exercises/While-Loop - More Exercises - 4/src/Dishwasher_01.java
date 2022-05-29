import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDetergent = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int mlUsedDetergent = countDetergent * 750;
        int allDishes = 0;
        int allPots = 0;
        int timeForPots = 0;
        boolean detergentOver = false;
        int startingDetergent = countDetergent * 750;
        while (!command.equals("End")) {
            int countDishes = Integer.parseInt(command);
            timeForPots++;
            if (timeForPots % 3 == 0) {
                mlUsedDetergent = mlUsedDetergent - (countDishes * 15);
                allPots += countDishes;
                if (mlUsedDetergent < 0) {
                    detergentOver = true;
                    break;
                }

            } else {
                mlUsedDetergent = mlUsedDetergent - (countDishes * 5);
                allDishes += countDishes;
                if (mlUsedDetergent < 0) {

                    detergentOver = true;
                    break;
                }

            }

            command = scanner.nextLine();

        }
        if (detergentOver) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(mlUsedDetergent));
        } else {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", allDishes, allPots);
            System.out.printf("Leftover detergent %d ml.", mlUsedDetergent);

        }
    }
}
