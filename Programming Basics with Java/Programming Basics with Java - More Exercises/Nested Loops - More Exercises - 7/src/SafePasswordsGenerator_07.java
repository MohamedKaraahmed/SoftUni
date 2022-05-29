import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int firstA = 35;
        int firstB = 64;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                count++;
                if (i == firstA && j == firstB) {
                    return;
                }
                char A = (char) firstA;
                char B = (char) firstB;

                System.out.print(A + "" + B + "" + i + "" + j + "" + B + "" + A + "");
                System.out.print('|');
                firstA++;
                if (firstA > 55) {
                    firstA = 35;
                }
                firstB++;
                if (firstB > 96) {
                    firstB = 64;
                }
                if (count >= maxPasswords) {
                    return;
                }

            }
        }

    }
}