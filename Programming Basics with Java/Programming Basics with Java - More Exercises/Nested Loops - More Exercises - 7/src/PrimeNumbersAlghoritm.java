import java.util.Scanner;

public class PrimeNumbersAlghoritm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNum = Integer.parseInt(scanner.nextLine());
        int n = scanner.nextInt();
        for (int i = 1; i <= currentNum ; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime numbers:" + " " + i);
            }
        }
    }
}
