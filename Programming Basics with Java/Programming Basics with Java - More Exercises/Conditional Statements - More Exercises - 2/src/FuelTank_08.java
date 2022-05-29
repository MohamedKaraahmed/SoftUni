import java.util.Scanner;

public class FuelTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int litersFuel = Integer.parseInt(scanner.nextLine());
        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")) {
            if (fuelType.equals("Diesel")) {

                if (litersFuel >= 25) {
                    System.out.println("You have enough diesel.");
                } else {
                    System.out.println("Fill your tank with diesel!");
                }
            } else if (fuelType.equals("Gasoline")) {
                if (litersFuel >= 25) {
                    System.out.println("You have enough gasoline.");
                } else {
                    System.out.println("Fill your tank with gasoline!");
                }
            } else {
                if (litersFuel >= 25) {
                    System.out.println("You have enough gas.");
                } else {
                    System.out.println("Fill your tank with gas!");
                }
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
