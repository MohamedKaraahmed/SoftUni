import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsNumberN = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;
        int dividesFromBlackBall = 0;


        for (int i = 1; i <= ballsNumberN; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                redBalls++;
                totalPoints = totalPoints + 5;
            } else if (color.equals("orange")) {
                orangeBalls++;
                totalPoints = totalPoints + 10;
            } else if (color.equals("yellow")) {
                yellowBalls++;
                totalPoints = totalPoints + 15;
            } else if (color.equals("white")) {
                whiteBalls++;
                totalPoints = totalPoints + 20;
            } else if (color.equals("black")) {
                blackBalls++;
                dividesFromBlackBall++;
                totalPoints = Math.floor(totalPoints / 2);

            } else {
                otherBalls++;
            }


        }
        System.out.printf("Total points: %.0f%n", totalPoints);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d", dividesFromBlackBall);

    }
}