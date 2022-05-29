import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneLvCount = Integer.parseInt(scanner.nextLine());
        int twoLvCount = Integer.parseInt(scanner.nextLine());
        int fiveLvCount = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        for (int levche = 0; levche <= oneLvCount; levche++) {
            for (int dvaLv = 0; dvaLv <= twoLvCount; dvaLv++) {
                for (int petLv = 0; petLv <= fiveLvCount; petLv++) {
                    if ((levche * 1) + (dvaLv * 2) + (petLv * 5) == sum) {
                        System.out.printf("%s * 1 lv. + %s * 2 lv. + %s * 5 lv. = %s lv.%n", levche, dvaLv, petLv, sum);
                    }
                }
            }
        }
    }
}
