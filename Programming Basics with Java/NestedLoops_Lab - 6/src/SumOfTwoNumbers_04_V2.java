import java.util.Scanner;

public class SumOfTwoNumbers_04_V2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int beginningOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());

        int countCombinations = 0;

        for (int i = beginningOfInterval; i <= endOfInterval; i++) {
            for (int j = beginningOfInterval; j <= endOfInterval; j++) {
                int sum = i + j;

                countCombinations++;
                if (sum == magicalNumber) {

                    System.out.printf("Combination N:%s ", countCombinations);
                    System.out.printf("(%s + %s = %s)%n", i, j, sum);
                    return;
                }

            }

        }
        System.out.printf("%s combinations - neither equals %s", countCombinations, magicalNumber);


    }
}
