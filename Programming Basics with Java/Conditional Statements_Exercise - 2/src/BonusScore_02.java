import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPoints = Integer.parseInt(scanner.nextLine());

        double bonus = 0;

        if (startingPoints <= 100) {
            bonus = 5;
        } else if (startingPoints <= 1000) {
            bonus = startingPoints * 0.20;

        } else {
            bonus = startingPoints * 0.10;
        }
        if (startingPoints % 2 == 0) {
            bonus = bonus + 1;
        }
        if (startingPoints % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(startingPoints + bonus);
    }

}
