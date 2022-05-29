import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startingYield = Integer.parseInt(scanner.nextLine());
        int count = 0;
        long source = startingYield;
        int sum = 0;
        while (startingYield >= 100) {
            count++;
            source = source - 26;
            sum += source;
            startingYield -= 10;
            source = startingYield;
        }
        if (sum >= 26){

            sum = sum - 26;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
