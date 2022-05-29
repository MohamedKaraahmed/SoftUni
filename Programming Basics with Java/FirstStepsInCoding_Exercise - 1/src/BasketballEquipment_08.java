import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearlyRent = Integer.parseInt(scanner.nextLine());
        double shoesPrice= yearlyRent - (yearlyRent * 0.40);
        double suit = shoesPrice - (shoesPrice * 0.20);
        double ball = suit / 4;
        double accessories = ball / 5;

        double totalSum = yearlyRent + shoesPrice + suit + ball + accessories;
        System.out.println(totalSum);

    }
}
