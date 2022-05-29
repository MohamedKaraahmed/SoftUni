import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                counter++;
                if (i + j == magicalNumber) {
                    System.out.printf("Combination N:%s (%s + %s = %s) ", counter, i, j, i + j);
                    isFound = true;
                    return;
                }

            }

        }
        if (isFound != true) {
            System.out.printf("%s combinations - neither equals %s", counter, magicalNumber);
            return;
        }
    }
}
// System.out.printf("%s combinations - neither equals %s", counter, magicalNumber);