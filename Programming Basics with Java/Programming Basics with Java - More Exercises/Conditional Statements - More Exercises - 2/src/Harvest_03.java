import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xSqrMIsGrape = Integer.parseInt(scanner.nextLine());
        double yGrapeFor1SqrM = Double.parseDouble(scanner.nextLine());
        int zNeededLiters = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrape = xSqrMIsGrape * yGrapeFor1SqrM;//1300
        double vine = (totalGrape * 0.40 ) / 2.5;//208
        double diff = Math.abs(vine - zNeededLiters);
        double literForWorkers = (vine - zNeededLiters)/countWorkers;
        if (vine >= zNeededLiters){

            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.",Math.ceil(vine),Math.ceil(diff),Math.ceil(literForWorkers));
        }else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(diff));
        }
    }
}