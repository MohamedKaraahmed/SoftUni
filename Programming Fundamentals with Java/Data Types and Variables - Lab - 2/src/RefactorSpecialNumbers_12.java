import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 0;
        boolean isSpecialNum = false;
        for (int i = 1; i <= n; i++) {
            number = i;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            sum = 0;
            if (isSpecialNum) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);

            }
        }

    }
}
