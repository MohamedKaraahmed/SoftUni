import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int hattricksCount = 0;
        String theBestPlayer = "";
        int allGoals = 0;
        boolean hattrickFlag = false;
        while (!input.equals("END")) {
            String playerName = input;
            int scoredGoals = Integer.parseInt(scanner.nextLine());

            if (scoredGoals > allGoals) {
                allGoals = scoredGoals;
                theBestPlayer = playerName;
            }

            if (scoredGoals >= 3) {
                hattricksCount++;
                hattrickFlag = true;
            }


            if (scoredGoals >= 10) {
                System.out.printf("%s is the best player! %nHe has scored %d goals and made a hat-trick !!!%n", playerName, scoredGoals);
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", theBestPlayer);
        if (hattrickFlag) {
            System.out.printf("He has scored %s goals and made a hat-trick !!!", allGoals);
        } else {
            System.out.printf("He has scored %s goals.", allGoals);
        }
    }
}
