import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int countPages= Integer.parseInt(scanner.nextLine());
        int readpagesPerHour= Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalHours= (countPages /readpagesPerHour)/days;
        System.out.println(totalHours);

    }
}
