import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        double allPoints = startingPoints;
        double winsCount = 0;
        double finalCount = 0;
        double semiFinalCount = 0;

        for (int i = 1; i <= countTournaments; i++) {
            String tournamentPhase = scanner.nextLine();

            switch (tournamentPhase) {
                case "W":
                    allPoints = allPoints + 2000;
                    winsCount++;
                    break;
                case "F":
                    allPoints = allPoints + 1200;
                    finalCount++;
                    break;
                case "SF":
                    allPoints = allPoints + 720;
                    semiFinalCount++;
                    break;
                default:
                    break;
            }
        }
        double averageWonPoints = ((winsCount * 2000) + (finalCount * 1200) + (semiFinalCount * 720)) / countTournaments;

        System.out.printf("Final points: %.0f\n", allPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(averageWonPoints));
        System.out.printf("%.2f%%", ((winsCount / countTournaments) * 100));

    }
}
