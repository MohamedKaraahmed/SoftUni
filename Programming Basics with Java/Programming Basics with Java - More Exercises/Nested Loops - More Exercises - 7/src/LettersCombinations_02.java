import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String beginningOfIntervalLetter = scanner.nextLine();
        String endOfIntervalLetter = scanner.nextLine();
        String exceptionalLetter = scanner.nextLine();
        char beginning = beginningOfIntervalLetter.charAt(0);
        char end = endOfIntervalLetter.charAt(0);
        char exception = exceptionalLetter.charAt(0);
        int count = 0;
        for (char i = beginning; i <= end; i++) {
            for (char j = beginning; j <= end; j++) {
                for (char k = beginning; k <= end; k++) {
                    if (i == exception || j == exception || k == exception) {

                    } else {
                        count++;
                        System.out.print(i + "" + j + "" + k);
                        System.out.print(" ");
                    }

                }
            }
        }
        System.out.print(count);
    }
}
