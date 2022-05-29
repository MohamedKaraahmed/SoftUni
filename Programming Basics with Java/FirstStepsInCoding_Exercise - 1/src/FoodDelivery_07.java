import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenu*10.35;
        double fishMenuPrice = fishMenu*12.40;
        double vegetarianMenuPrice = vegetarianMenu *8.15;
        double allMenuPrice = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice;
        double desertPrice = allMenuPrice * 0.20;
        double deliveryPrice= 2.50;
        double totalSum= allMenuPrice + desertPrice + deliveryPrice;
        System.out.println(totalSum);



    }
}
