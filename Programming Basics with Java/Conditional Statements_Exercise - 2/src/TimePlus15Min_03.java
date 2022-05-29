import java.util.Scanner;

public class TimePlus15Min_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHour = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        int allMin = (initHour * 60) + initMin + 15;

        int hour = allMin / 60;
        int min = allMin % 60;

        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, min);
    }

}

