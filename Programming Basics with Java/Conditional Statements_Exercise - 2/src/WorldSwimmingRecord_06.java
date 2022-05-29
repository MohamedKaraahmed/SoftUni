import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordForOvercome = Double.parseDouble(scanner.nextLine());
        double metersForSwimming = Double.parseDouble(scanner.nextLine());
        double secondsFor1M = Double.parseDouble(scanner.nextLine());

        double ivanShouldSwim = (metersForSwimming * secondsFor1M);
        double delay = Math.floor(metersForSwimming / 15) * 12.5;
        double totalTime = ivanShouldSwim + delay;
        double diff = Math.abs(totalTime - recordForOvercome);

        if (totalTime < recordForOvercome) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);

        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }


    }
}
