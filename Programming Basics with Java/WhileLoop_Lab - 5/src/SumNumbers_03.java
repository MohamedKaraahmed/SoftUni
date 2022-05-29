import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        //kakvo povtarqme:chetem chislo ot konzolata
        //koga spirame : kogato sumata im stane po golqma ili ravna na number
        //promenqme promenlivata: chetem novo chislo
        int sum = 0;

        while (sum < number) {
            int currNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currNumber;
        }
        System.out.println(sum);
    }
}
