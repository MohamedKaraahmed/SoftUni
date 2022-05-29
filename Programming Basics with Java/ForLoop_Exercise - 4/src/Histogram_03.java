import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;

            } else if (number <= 399) {
                p2++;

            } else if (number <= 599) {
                p3++;

            } else if (number <= 799) {
                p4++;

            } else {

                p5++;
            }
        }

        double p1InP = p1 * 1.0 / n * 100;
        double p2InP = p2 * 1.0 / n * 100;
        double p3InP = p3 * 1.0 / n * 100;
        double p4InP = p4 * 1.0 / n * 100;
        double p5InP = p5 * 1.0 / n * 100;
        System.out.printf("%.2f%%%n", p1InP);
        System.out.printf("%.2f%%%n", p2InP);
        System.out.printf("%.2f%%%n", p3InP);
        System.out.printf("%.2f%%%n", p4InP);
        System.out.printf("%.2f%%%n", p5InP);
    }
}
