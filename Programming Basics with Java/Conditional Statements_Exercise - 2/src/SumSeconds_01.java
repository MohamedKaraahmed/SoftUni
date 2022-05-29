import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int allTime = first + second + third;
        int min = allTime / 60;
        int sec = allTime % 60;


        if (sec < 10) {
            System.out.printf("%d:%02d", min, sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }


    }

}

