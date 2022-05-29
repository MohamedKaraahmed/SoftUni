import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {

                System.out.println(amount * 0.50);
            } else if (product.equals("water")) {
                System.out.println(amount * 0.80);

            } else if (product.equals("beer")) {
                System.out.println(amount * 1.20);

            } else if (product.equals("sweets")) {
                System.out.println(amount * 1.45);


            } else {
                System.out.println(amount * 1.60);
            }

        } else if (town.equals("Plovdiv")) {

            if (product.equals("coffee")) {
                System.out.println(amount * 0.40);

            } else if (product.equals("water")) {
                System.out.println(amount * 0.70);

            } else if (product.equals("beer")) {
                System.out.println(amount * 1.15);

            } else if (product.equals("sweets")) {
                System.out.println(amount * 1.30);

            } else {
                System.out.println(amount * 1.50);
            }

        } else {
            if (product.equals("coffee")) {
                System.out.println(amount * 0.45);
            } else if (product.equals("water")) {
                System.out.println(amount * 0.70);

            } else if (product.equals("beer")) {
                System.out.println(amount * 1.10);

            } else if (product.equals("sweets")) {
                System.out.println(amount * 1.35);
            } else {
                System.out.println(amount * 1.55);
            }

        }

    }
}
