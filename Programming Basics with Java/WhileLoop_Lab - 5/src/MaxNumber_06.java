import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = Integer.MIN_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            int number = Integer.parseInt(input);
            if (number > max) {
                max = number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%.0f",max);
    }
}
