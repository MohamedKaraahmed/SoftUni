import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (projection.equals("Premiere")) {
            price = rows * columns * 12.0;
            System.out.printf("%.2f leva", price);

        } else if (projection.equals("Normal")) {
            price = rows * columns * 7.50;
            System.out.printf("%.2f leva", price);
        } else {
            price = rows * columns * 5.0;
            System.out.printf("%.2f leva", price);
        }

    }
}
