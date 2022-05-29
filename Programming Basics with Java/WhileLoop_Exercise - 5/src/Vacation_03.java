import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededMoneyForExcursion = Double.parseDouble(scanner.nextLine());
        double existingMoney = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        double allMoney = existingMoney;
        int spendingMoneyDaysInARow = 0;
        boolean isFailed = false;
        while (allMoney < neededMoneyForExcursion) {

            if (spendingMoneyDaysInARow >= 5) {
                isFailed = true;
                break;
            }
            String saveOrSpend = scanner.nextLine();
            double saveOrSpendMoney = Double.parseDouble(scanner.nextLine());

            if (saveOrSpend.equals("spend")) {
                allMoney = allMoney - saveOrSpendMoney;
                if (allMoney < 0) {
                    allMoney = 0;
                }
                spendingMoneyDaysInARow++;
            } else if (saveOrSpend.equals("save")) {
                allMoney = allMoney + saveOrSpendMoney;
                spendingMoneyDaysInARow = 0;
            }
            countDays++;


        }
        if (isFailed) {
            System.out.printf("You can't save the money.%n%d", countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }

}
