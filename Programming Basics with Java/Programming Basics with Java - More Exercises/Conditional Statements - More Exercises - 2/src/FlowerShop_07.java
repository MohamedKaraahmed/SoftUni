import java.util.Scanner;

public class FlowerShop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoliiCount = Integer.parseInt(scanner.nextLine());
        int ziumbiuliCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int kaktusiCount = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double magnoliiPrice = magnoliiCount * 3.25;
        double ziumbiuliPrice = ziumbiuliCount * 4;
        double rosesPrice = rosesCount * 3.50;
        double kaktusiPrice = kaktusiCount * 8;

        double profit = (magnoliiPrice + ziumbiuliPrice + rosesPrice + kaktusiPrice) * 0.95;

        if (profit >= presentPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(profit - presentPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice - profit));
        }

    }
}
