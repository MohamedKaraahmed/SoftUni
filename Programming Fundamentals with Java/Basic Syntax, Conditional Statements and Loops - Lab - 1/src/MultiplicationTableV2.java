import java.util.Scanner;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theInteger = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = times; i <= 10; i++) {
            int product = theInteger * i;

            System.out.printf("%s X %s = %s%n", theInteger, i, product);
        }
        if (times > 10) {
            System.out.printf("%s X %s = %s", theInteger, times, theInteger * times);

        }
    }
}
