import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double over20KgPrice = Double.parseDouble(scanner.nextLine());
        double kgBaggage = Double.parseDouble(scanner.nextLine());
        int daysToTravel = Integer.parseInt(scanner.nextLine());
        int countBaggage = Integer.parseInt(scanner.nextLine());


//        ceni na bagajite i proverki
        double under10KgPrice = 0;
        double under20KgPrice = 0;
        double above20KgPrice = 0;
        if (kgBaggage < 10) {
            under10KgPrice = over20KgPrice * 0.20;
        } else if (kgBaggage <= 20) {
            under20KgPrice = over20KgPrice * 0.50;
        } else {
            above20KgPrice = over20KgPrice;
        }
        double allBaggageSum = under10KgPrice + under20KgPrice + above20KgPrice;
        double totalSum = allBaggageSum * countBaggage;
//     proverki na dnite
        if (daysToTravel < 7) {
            totalSum = totalSum * 1.40;

        } else if (daysToTravel <= 30) {

            totalSum = totalSum * 1.15;
        } else {
            totalSum = totalSum * 1.10;
        }

        System.out.printf("The total price of bags is: %.2f lv.", totalSum);
    }
}
