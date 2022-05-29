import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = start; firstDigit <= end; firstDigit++) {
            for (int secondDigit = start; secondDigit <= end; secondDigit++) {
                for (int thirdDigit = start; thirdDigit <= end; thirdDigit++) {
                    for (int fourthDigit = start; fourthDigit <= end; fourthDigit++) {
                        if (firstDigit % 2 == 0 && fourthDigit % 2 != 0 || fourthDigit % 2 == 0 && firstDigit % 2 != 0) {
                            if (firstDigit > fourthDigit) {
                                if ((secondDigit + thirdDigit) % 2 == 0) {
                                    System.out.printf("%s%s%s%s ", firstDigit, secondDigit, thirdDigit, fourthDigit);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
