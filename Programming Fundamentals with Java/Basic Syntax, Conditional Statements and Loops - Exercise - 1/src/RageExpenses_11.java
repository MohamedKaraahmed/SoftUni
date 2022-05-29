import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int count = 0;
        double expenses = 0;
        for (int i = 1; i <= lostGames; i++) {
            count++;
            if (count % 2 == 0) {
                //headset
                expenses = expenses + headsetPrice;
            }
            if (count % 3 == 0) {
                //mouse
                expenses = expenses + mousePrice;
            }
            if (count % 6 == 0) {
                //keyboard
                expenses = expenses + keyboardPrice;
            }
            if (count % 12 == 0) {
                //display
                expenses = expenses + displayPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
