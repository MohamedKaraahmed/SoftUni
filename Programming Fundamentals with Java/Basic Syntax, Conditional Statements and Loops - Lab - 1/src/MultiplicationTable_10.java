import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            String result = String.format("%d X %d = %d%n", number, i, product);
            System.out.print(result);
        }
    }
}
