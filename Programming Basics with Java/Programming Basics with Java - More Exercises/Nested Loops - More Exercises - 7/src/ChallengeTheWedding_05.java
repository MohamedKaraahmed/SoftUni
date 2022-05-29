import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mansCount = Integer.parseInt(scanner.nextLine());
        int womenCount = Integer.parseInt(scanner.nextLine());
        int allSeats = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 1; i <= mansCount; i++) {
            for (int j = 1; j <= womenCount; j++) {
                count++;
                System.out.printf("(%s <-> %s) ", i, j);
                if (count == allSeats) {
                    return;
                }
            }
        }
    }
}
