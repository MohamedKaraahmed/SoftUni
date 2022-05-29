import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetableKgPrice = Double.parseDouble(scanner.nextLine());
        double fruitsKgPrice = Double.parseDouble(scanner.nextLine());
        int sumVegetableKgs = Integer.parseInt(scanner.nextLine());
        int sumFruitsKgs = Integer.parseInt(scanner.nextLine());

        double euro = 1.94;
        double sumVeg = vegetableKgPrice * sumVegetableKgs;
        double sumFru = fruitsKgPrice * sumFruitsKgs ;
        double total = sumVeg + sumFru;
        double totalInEuro = total / 1.94;

        System.out.printf("%.2f",totalInEuro );


    }
}
