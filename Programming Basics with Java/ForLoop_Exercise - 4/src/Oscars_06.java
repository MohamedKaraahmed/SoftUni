import javax.swing.*;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startingPoints = Double.parseDouble(scanner.nextLine());
        int countAppreciative = Integer.parseInt(scanner.nextLine());
        double totalPoints = startingPoints;

        for (int i = 1; i <= countAppreciative; i++) {
            String name = scanner.nextLine();
            double givenPoints = Double.parseDouble(scanner.nextLine());
            double pointsSum = (name.length() * givenPoints) / 2;
            if (totalPoints < 1250.5) {
                totalPoints = totalPoints + pointsSum;
            }
        }

        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {

            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }


    }
}