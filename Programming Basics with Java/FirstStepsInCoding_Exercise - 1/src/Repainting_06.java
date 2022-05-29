import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonQuantity= Integer.parseInt(scanner.nextLine());
        int paintQuantity= Integer.parseInt(scanner.nextLine());
        int razorQuantity= Integer.parseInt(scanner.nextLine());
        int hours=Integer.parseInt(scanner.nextLine());

        double priceAllNylon=(nylonQuantity + 2) * 1.50;
        double priceAllPaint=(paintQuantity *1.10) * 14.50;
        double priceAllRazor= razorQuantity * 5.0;

        double allMaterialsPrice= priceAllNylon + priceAllPaint + priceAllRazor + 0.40;
        double maestroSum= (allMaterialsPrice * 0.30) * hours;
        double totalSum= allMaterialsPrice + maestroSum;

        System.out.println(totalSum);
    }
}