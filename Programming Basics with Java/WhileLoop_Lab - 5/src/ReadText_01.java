import java.util.Scanner;

public class ReadText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //kakvo povtarqme = pechatame text
        //spirame kogato input = Stop
        //promenqme sus sledvashtiq red ot konzolata
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            System.out.println(input);
            input = scanner.nextLine();

        }

    }
}
