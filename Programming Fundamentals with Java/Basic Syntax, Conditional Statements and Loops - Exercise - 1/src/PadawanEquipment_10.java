import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyAmount = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightSabersSum = Math.ceil(studentsCount + 0.10 * studentsCount) * lightSabersPrice;
        double robesSum = robesPrice * studentsCount;
        double beltsSum = (studentsCount - studentsCount / 6) * beltPrice;

        double totalSum = lightSabersSum + robesSum + beltsSum;


        if (totalSum <=moneyAmount ) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double neededMoney = totalSum - moneyAmount;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }
    }
}
