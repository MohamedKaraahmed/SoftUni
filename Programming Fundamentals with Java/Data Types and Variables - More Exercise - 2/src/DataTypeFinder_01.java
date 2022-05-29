import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String input = command;
            if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type",input);
            }
            command = scanner.nextLine();
        }
    }
}
