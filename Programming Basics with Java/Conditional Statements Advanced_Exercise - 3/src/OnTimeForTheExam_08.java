import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMins = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMins = Integer.parseInt(scanner.nextLine());

        int examTimeInMin = (examHour * 60) + examMins;
        int arrivalTimeInMin = (arrivalHour * 60) + arrivalMins;
// exam time ->9:30  = 570 min
//   arr time->9:50 = 590 min
        int diff = Math.abs(examTimeInMin - arrivalTimeInMin);
        if (examTimeInMin < arrivalTimeInMin) {
            System.out.println("Late");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, min);
            } else {
                System.out.printf("%d minutes after the start ", diff);
            }

        } else if ((examTimeInMin == arrivalTimeInMin) || (diff <= 30)) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }

        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            } else {
                System.out.printf("%d minutes before the start ", diff);
            }
        }


    }
}
