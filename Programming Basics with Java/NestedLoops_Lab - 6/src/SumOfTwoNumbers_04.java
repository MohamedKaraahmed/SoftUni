import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginningOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());
        boolean magicalNumberFound = false;
        int countCombinations = 0;
        int zaI = 0;
        int zaJ = 0;
        for (int i = beginningOfInterval; i <= endOfInterval; i++) {
            for (int j = beginningOfInterval; j <= endOfInterval; j++) {

                countCombinations++;
                if (i + j == magicalNumber) {
                    zaI = i;
                    zaJ = j;
//                    System.out.printf("Combination N:%s%n", countCombinations);
//                    System.out.printf("(%s + %s = %s)%n", i, j, i+j);
                    magicalNumberFound = true;
                    break;
                }


            }
            if (magicalNumberFound) {
                break;
            }

        }
        if (magicalNumberFound) {
            System.out.printf("Combination N:%s ", countCombinations);
            System.out.printf("(%s + %s = %s)%n", zaI, zaJ, zaI + zaJ);
        } else {
            System.out.printf("%s combinations - neither equals %s", countCombinations, magicalNumber);
        }
    }
}
