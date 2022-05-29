import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int previousSum = 0;
        int diff = 0;
        for (int i = 1; i <= n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            int currentSum = number1 + number2;

            if (i == 1 ){
                currentSum = number1 + number2;
                previousSum = currentSum;
                currentSum = 0;
                continue;
            }
            if (Math.abs(previousSum - currentSum) > 0) {
                diff = currentSum - previousSum;

            }
            previousSum = currentSum;
            currentSum = 0;
        }
        if (diff != 0) {
            System.out.printf("No, maxdiff=%d", Math.abs(diff));
        } else {
            System.out.printf("Yes, value=%d", previousSum);
        }
    }
}
