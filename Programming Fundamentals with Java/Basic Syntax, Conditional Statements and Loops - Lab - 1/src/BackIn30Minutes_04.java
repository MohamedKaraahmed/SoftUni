import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int allMins = (hour * 60) + min + 30;
        int hours = allMins / 60;
        int mins = allMins % 60;
        if (hour >= 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, mins);
    }
}
