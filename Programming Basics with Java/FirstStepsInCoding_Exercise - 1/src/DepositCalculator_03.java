import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit= Double.parseDouble(scanner.nextLine());
        int months=  Integer.parseInt(scanner.nextLine());
       double yearsPercent= Double.parseDouble(scanner.nextLine());
//        double sum = deposit + months *((deposit*yearsPercent)/12);
       double increase = deposit *(yearsPercent/100);
       double monthlyIncrease= increase/12;
       double result= deposit +months*monthlyIncrease;
        System.out.println(result);

    }
}
