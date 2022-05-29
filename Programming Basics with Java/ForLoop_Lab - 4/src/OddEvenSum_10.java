import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int chetnaEvenSum = 0;
        int nechetnaOddSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                chetnaEvenSum = chetnaEvenSum + number;
            } else {
                nechetnaOddSum = nechetnaOddSum + number;
            }

        }
        int diff = Math.abs(chetnaEvenSum - nechetnaOddSum);
        if (chetnaEvenSum == nechetnaOddSum) {
            System.out.printf("Yes %nSum = %s", chetnaEvenSum);
        } else {

            System.out.printf("No %nDiff = %s", diff);
        }

    }
}
