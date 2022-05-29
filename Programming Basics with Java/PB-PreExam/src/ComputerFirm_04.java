import java.util.Scanner;

public class ComputerFirm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCountPc = Integer.parseInt(scanner.nextLine());
        double avgRating = 0;
        double countSells = 0;


        for (int number = 1; number <= nCountPc; number++) {
            int possibleSellsAndRating = Integer.parseInt(scanner.nextLine());
            int rating = possibleSellsAndRating % 10;
            avgRating = avgRating + rating;
            double possibleSells = Math.floor(1.0 * possibleSellsAndRating / 10);
            if (rating == 2) {
                possibleSells = possibleSells * 0;
                countSells = countSells + possibleSells;
            } else if (rating == 3) {
                possibleSells = possibleSells / 2;
                countSells = countSells + possibleSells;
            } else if (rating == 4) {
                possibleSells = possibleSells * 0.70;
                countSells = countSells + possibleSells;
            } else if (rating == 5) {
                possibleSells = possibleSells * 0.85;
                countSells = countSells + possibleSells;
            } else if (rating == 6) {
                possibleSells = possibleSells * 1.0;
                countSells = countSells + possibleSells;
            }

        }
        avgRating = avgRating / nCountPc;
        System.out.printf("%.2f%n", countSells);
        System.out.printf("%.2f", avgRating);
    }
}
