import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {

            if (fruit.equals("banana")) {
                System.out.printf("%.2f", quantity * 2.50);
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", quantity * 1.20);
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", quantity * 0.85);
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", quantity * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", quantity * 2.70);
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", quantity * 5.50);
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", quantity * 3.85);
            } else {
                System.out.println("error");
            }

        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            if (fruit.equals("banana")) {
                System.out.printf("%.2f", quantity * 2.70);
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", quantity * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", quantity * 0.90);
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", quantity * 1.60);
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", quantity * 3.00);
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", quantity * 5.60);
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", quantity * 4.20);
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }


    }
}