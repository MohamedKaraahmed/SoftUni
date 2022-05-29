import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int number = 1; number <= n; number++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + number1;
        }
        for (int number = 1; number <= n; number++) {
            int number2 = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + number2;

        }

        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum1);
        } else {
            int diff = Math.abs(sum1 - sum2);
            System.out.println("No, diff = " + diff);
        }

    }
}
