import java.util.Scanner;

public class LuckyNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 1; firstDigit <= 9; firstDigit++) {
            for (int secondDigit = 1; secondDigit <= 9; secondDigit++) {
                for (int thirdDigit = 1; thirdDigit <= 9; thirdDigit++) {
                    for (int fourthDigit = 1; fourthDigit <= 9; fourthDigit++) {
                        if ((firstDigit + secondDigit) == (thirdDigit + fourthDigit) && (n % (firstDigit + secondDigit) == 0)) {
                            System.out.printf("%s%s%s%s ", firstDigit, secondDigit, thirdDigit, fourthDigit);

                        }
                    }
                }
            }
        }


    }
}
// System.out.printf("%s%s%s%s ", firstDigit,secondDigit,thirdDigit,fourthDigit);
//System.out.print(firstDigit + "" + secondDigit +""+ thirdDigit+""+ fourthDigit+ " ");