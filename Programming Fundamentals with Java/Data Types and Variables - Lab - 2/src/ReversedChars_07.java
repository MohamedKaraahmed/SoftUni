import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        String sum = first + second + third;
        for (int i = sum.length() - 1; i >= 0; i--) {
            char symbol = sum.charAt(i);
            System.out.print(symbol + " ");

        }
    }
}
