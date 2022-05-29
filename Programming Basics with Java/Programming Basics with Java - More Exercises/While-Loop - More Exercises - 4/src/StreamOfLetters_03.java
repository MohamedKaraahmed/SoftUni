import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int counterC = 0;
        int counterO = 0;
        int counterN = 0;
        String word = " ";
        while (!command.equals("End")) {
            char symbol = command.charAt(0);
            // pri validna duma
            if (symbol >= 'a' && symbol <= 'z' || symbol >= 'A' && symbol <= 'Z') {
                if (symbol == 'c' && counterC == 0) {
                    counterC++;
                } else if (symbol == 'o' && counterO == 0) {
                    counterO++;
                } else if (symbol == 'n' && counterN == 0) {
                    counterN++;
                } else {
                    word = word + symbol;
                }

                if (counterC + counterO + counterN == 3) {
                    System.out.print(word);

                    counterC = 0;
                    counterO = 0;
                    counterN = 0;
                    word = " ";
                }
            }

            command = scanner.nextLine();

        }
    }
}
