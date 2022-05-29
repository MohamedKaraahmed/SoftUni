import java.util.Scanner;

public class CristmasGifts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toysCount = 0;
        int pulloverCount = 0;
        int adultsCount = 0;
        int kidsCount = 0;


        String input = scanner.nextLine();
        while (!input.equals("Christmas")) {
            int ages = Integer.parseInt(input);
            if (ages <= 16) {
                kidsCount++;
                toysCount++;
            } else {
                adultsCount++;
                pulloverCount++;
            }
            input = scanner.nextLine();
        }
        int toysPrice = toysCount * 5;
        int pulloverPrice = pulloverCount * 15;
        System.out.println("Number of adults: " + adultsCount);
        System.out.println("Number of kids: " + kidsCount);
        System.out.println("Money for toys: " + toysPrice);
        System.out.println("Money for sweaters: " + pulloverPrice);
    }
}
