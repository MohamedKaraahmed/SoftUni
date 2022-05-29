import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //1nachalo- purvoto chislo (1)
        //2krai- posledno chislo (n)
        //3povtarqme deistvie- prochitame stoinosta i sumirame
        //4izmenqme s- +1
        int sum = 0;
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());// stoinosta na chisloto
            sum += value;
        }
        System.out.println(sum);
    }
}
