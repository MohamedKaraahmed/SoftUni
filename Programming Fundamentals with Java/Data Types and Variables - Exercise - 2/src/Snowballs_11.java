import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSnowball = Integer.parseInt(scanner.nextLine());// N
        int maxValue = Integer.MIN_VALUE;
        int mostSnow = 0;
        int mostTime = 0;
        int mostQuality = 0;
        for (int i = 1; i <= numberOfSnowball; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            // Formula - (snowballSnow / snowballTime ) ^ snowballQuality
            double snowballValue = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);
            snowballValue = (int)snowballValue;
            if (snowballValue > maxValue) {
                maxValue = (int) snowballValue;
                mostSnow = snowballSnow;
                mostTime = snowballTime;
                mostQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", mostSnow, mostTime, maxValue, mostQuality);
    }
}
