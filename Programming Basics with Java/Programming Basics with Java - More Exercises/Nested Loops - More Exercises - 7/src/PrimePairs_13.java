import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCouple = Integer.parseInt(scanner.nextLine());
        int secondCouple = Integer.parseInt(scanner.nextLine());
        int firstCDiff = Integer.parseInt(scanner.nextLine());
        int secondCDiff = Integer.parseInt(scanner.nextLine());
        int countA = 0;
        int countB = 0;
        for (int i = firstCouple; i <= firstCouple + firstCDiff; i++) {
            countA = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countA++;
                }
            }
            if (countA == 2) {
                for (int k = secondCouple; k <= secondCouple + secondCDiff; k++) {
                    countB = 0;
                    for (int l = 1; l <= k; l++) {
                        if (k % l == 0) {
                            countB++;
                        }
                    }
                    if (countB == 2) {
                        System.out.printf("%s%s %n", i, k);
                    }
                }
            }
        }
    }
}

// if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0) {
//         System.out.printf("%s%s%n", i, j);
//         }