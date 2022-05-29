import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        if (hour >= 10 && hour <= 18) {
            if (dayOfWeek.equals("Monday")) {
                System.out.println("open");
            } else if (dayOfWeek.equals("Tuesday")) {
                System.out.println("open");
            } else if (dayOfWeek.equals("Wednesday")) {
                System.out.println("open");
            } else if (dayOfWeek.equals("Thursday")) {
                System.out.println("open");
            } else if (dayOfWeek.equals("Friday")) {
                System.out.println("open");
            } else if (dayOfWeek.equals("Saturday")) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }

        } else {
            System.out.println("closed");
        }

    }
}
