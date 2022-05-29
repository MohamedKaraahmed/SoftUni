import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJoinery = Integer.parseInt(scanner.nextLine());
        String kindJoinery = scanner.nextLine();
        String kindReceive = scanner.nextLine();

        if (countJoinery < 10) {
            System.out.println("Invalid order");
            return;
        }
        double sum = 0;
        if (kindJoinery.equals("90X130")) {
            sum = countJoinery * 110;
            if (countJoinery > 30 && countJoinery < 60) {
                sum = sum * 0.95;
            } else if (countJoinery > 60) {
                sum = sum * 0.92;
            }

        } else if (kindJoinery.equals("100X150")) {
            sum = countJoinery * 140;
            if (countJoinery > 40 && countJoinery < 80) {
                sum = sum * 0.94;
            } else if (countJoinery > 80) {
                sum = sum * 0.90;
            }

        } else if (kindJoinery.equals("130X180")) {
            sum = countJoinery * 190;
            if (countJoinery > 20 && countJoinery < 50) {
                sum = sum * 0.93;
            } else if (countJoinery > 50) {
                sum = sum * 0.88;
            }
        } else if (kindJoinery.equals("200X300")) {
            sum = countJoinery * 250;
            if (countJoinery > 25 && countJoinery < 50) {
                sum = sum * 0.91;
            } else if (countJoinery > 50) {
                sum = sum * 0.86;
            }


        }
        if (kindReceive.equals("With delivery")) {
            sum = sum + 60;
        }
        if (countJoinery > 99) {
            sum = sum * 0.96;
        }
        System.out.printf("%.2f BGN", sum);
    }
}
