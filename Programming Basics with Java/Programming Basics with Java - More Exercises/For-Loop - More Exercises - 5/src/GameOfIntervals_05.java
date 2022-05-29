import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int movesCount = Integer.parseInt(scanner.nextLine());
        double points = 0;
        int from0to9 = 0;
        int from10to19 = 0;
        int from20to29 = 0;
        int from30to39 = 0;
        int from40to50 = 0;
        int invalidNumbers = 0;
        for (int i = 1; i <= movesCount; i++) {
            int moveNumber = Integer.parseInt(scanner.nextLine());
            if (moveNumber < 0 || moveNumber > 50) {
                points = points / 2;
                invalidNumbers++;
            } else if (moveNumber <= 9) {
                points = points + moveNumber * 0.20;
                from0to9++;
            } else if (moveNumber <= 19) {
                points = points + moveNumber * 0.30;
                from10to19++;
            } else if (moveNumber <= 29) {
                points = points + moveNumber * 0.40;
                from20to29++;
            } else if (moveNumber <= 39) {
                points = points + 50;
                from30to39++;
            } else if (moveNumber <= 50) {
                points = points + 100;
                from40to50++;
            }
        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", from0to9 * 1.0 / movesCount * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", from10to19 * 1.0 / movesCount * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", from20to29 * 1.0 / movesCount * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", from30to39 * 1.0 / movesCount * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", from40to50 * 1.0 / movesCount * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNumbers * 1.0 / movesCount * 100);
    }
}
