import java.util.Scanner;

public class ChristmasTree_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.print(" ");
            System.out.print("|");
            System.out.print(" ");

            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
