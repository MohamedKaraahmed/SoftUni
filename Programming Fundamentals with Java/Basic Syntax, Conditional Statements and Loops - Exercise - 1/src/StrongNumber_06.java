import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int factSum = 0;
        int startingNumber = number;
        while (number > 0) {
            int currentDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= currentDigit; i++) {
                fact = fact * i;
            }
            factSum = factSum + fact;
            fact = 1;
            number = number / 10;
        }
        if (startingNumber == factSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
