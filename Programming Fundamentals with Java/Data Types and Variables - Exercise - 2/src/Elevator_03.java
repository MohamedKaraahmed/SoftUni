import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int count = 0;
        while (peopleNumber > 0) {
            peopleNumber -= capacity;
            count++;
        }
        System.out.println(count);
    }
}
