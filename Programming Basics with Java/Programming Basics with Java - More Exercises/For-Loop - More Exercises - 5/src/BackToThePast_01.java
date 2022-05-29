import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        double sum = inheritedMoney;
        int iYearsOld = 18;
        for (int i = 1800; i <= yearToLive; i++) {
            if (i % 2 == 0) {
                sum = sum - 12000;
                iYearsOld++;
            } else {
                sum = sum - (12000 + (50 * iYearsOld));
                iYearsOld++;
            }

        }
        if (sum  >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", sum);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(sum));
        }

//        if (Math.abs(sum + inheritedMoney) >= inheritedMoney) {
//            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", sum);
//        } else {
//            System.out.printf("He will need %.2f dollars to survive.", Math.abs(sum));
//        }

    }
}
