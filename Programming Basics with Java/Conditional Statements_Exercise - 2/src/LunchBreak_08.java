import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int serialLength = Integer.parseInt(scanner.nextLine());
        int breakLength = Integer.parseInt(scanner.nextLine());


        double lunchTime = breakLength / 8.0;
        double restTime = breakLength / 4.0;
        double leftTime = breakLength - lunchTime - restTime;
        double diff = Math.abs(leftTime - serialLength);
        if (leftTime >= serialLength) {
            System.out.printf("You have enough time to watch " +
                    "%s and left with %.0f " +
                    "minutes free time.", serialName, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, " +
                    "you need %.0f more minutes.", serialName, Math.ceil(diff));
        }


    }
}
