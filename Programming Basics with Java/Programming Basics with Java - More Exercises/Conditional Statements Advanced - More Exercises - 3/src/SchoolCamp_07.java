import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupKind = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        String sportKind = "";
        double sum = 0;

        // proverka za sezon(vakanciq)
        if (season.equals("Winter")) {
            if (groupKind.equals("boys")) {
                sum = (studentsCount * 9.60) * nightsCount;
                sportKind = "Judo";
            } else if (groupKind.equals("girls")) {
                sum = (studentsCount * 9.60) * nightsCount;
                sportKind = "Gymnastics";
            } else if (groupKind.equals("mixed")) {
                sum = (studentsCount * 10) * nightsCount;
                sportKind = "Ski";
            }
        } else if (season.equals("Spring")) {
            if (groupKind.equals("boys")) {
                sum = (studentsCount * 7.20) * nightsCount;
                sportKind = "Tennis";
            } else if (groupKind.equals("girls")) {
                sum = (studentsCount * 7.20) * nightsCount;
                sportKind = "Athletics";
            } else if (groupKind.equals("mixed")) {
                sum = (studentsCount * 9.50) * nightsCount;
                sportKind = "Cycling";
            }
        } else if (season.equals("Summer")) {
            if (groupKind.equals("boys")) {
                sum = (studentsCount * 15) * nightsCount;
                sportKind = "Football";
            } else if (groupKind.equals("girls")) {
                sum = (studentsCount * 15) * nightsCount;
                sportKind = "Volleyball";
            } else if (groupKind.equals("mixed")) {
                sum = (studentsCount * 20) * nightsCount;
                sportKind = "Swimming";
            }

        }

        //proverka za grupata (otstupka)
        if (studentsCount >= 10 && studentsCount < 20) {
            sum = sum * 0.95;
        } else if (studentsCount >= 20 && studentsCount < 50) {
            sum = sum * 0.85;
        } else if (studentsCount >= 50) {
            sum = sum * 0.50;
        }
        System.out.printf("%s %.2f lv.", sportKind, sum);
    }
}
