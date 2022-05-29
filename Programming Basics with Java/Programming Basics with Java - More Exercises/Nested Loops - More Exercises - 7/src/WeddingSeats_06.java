import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastSector = scanner.nextLine();
        int countRowsInFirstSector = Integer.parseInt(scanner.nextLine());
        int oddsSeatsCount = Integer.parseInt(scanner.nextLine());
        int evenSeatsCount = oddsSeatsCount + 2;
        int rows = countRowsInFirstSector;
        int allSeatsCount = 0;
        for (char sector = 'A'; sector <= lastSector.charAt(0); sector++) {
            for (int row = 1; row <= rows; row++) {
                if (row % 2 != 0) {
                    int count = 0;
                    for (char i = 'a'; i <= 'z'; i++) {
                        count++;
                        System.out.printf("%c%s%c%n ", sector, row, i);
                        allSeatsCount++;
                        if (count == oddsSeatsCount) {
                            break;
                        }
                    }
                } else {
                    int count = 0;
                    for (int i = 'a'; i <= 'z'; i++) {
                        count++;
                        System.out.printf("%c%s%c%n ", sector, row, i);
                        allSeatsCount++;
                        if (count == evenSeatsCount) {
                            break;
                        }
                    }
                }
            }
            rows++;
        }
        System.out.print(allSeatsCount);
    }

}
