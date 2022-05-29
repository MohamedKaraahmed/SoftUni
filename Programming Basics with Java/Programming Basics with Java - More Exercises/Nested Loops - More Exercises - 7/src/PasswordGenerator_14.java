import java.util.Scanner;

public class PasswordGenerator_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int a = 97;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = a; k < l + a; k++) {
                    for (int m = a; m < l + a; m++) {
                        for (int o = 1; o <= n; o++) {
                            char firstC = (char) k;
                            char secondC = (char) m;
                            if (o > i && o > j) {
                                System.out.printf("%s%s%s%s%s ", i, j, firstC, secondC, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
