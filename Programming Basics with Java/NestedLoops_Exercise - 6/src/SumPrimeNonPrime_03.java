import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeNumbersSum = 0;
        int nonPrimeNumbersSum = 0;


        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);

            if (currentNumber < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= currentNumber; i++) {
                if (currentNumber % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumbersSum = primeNumbersSum + currentNumber;
            } else {
                nonPrimeNumbersSum = nonPrimeNumbersSum + currentNumber;
            }


            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbersSum);

        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNumbersSum);
    }
}
