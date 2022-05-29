import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double square= Double.parseDouble(scanner.nextLine());
        double pricePerSquare=square* 7.61;
        double discount= pricePerSquare* 0.18;
        double finalPrice = pricePerSquare - discount;

        System.out.println(finalPrice);
        System.out.println(discount);



    }
}
