import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hundredsBorder = Integer.parseInt(scanner.nextLine());
        int digitsBorder = Integer.parseInt(scanner.nextLine());
        int unitsBorder = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= hundredsBorder; i += 2) {
            for (int j = 1; j <= digitsBorder; j++) {
                for (int k = 2; k <= unitsBorder; k += 2) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.printf("%s %s %s%n", i, j, k);
                    }
                }
            }
        }
    }
}
