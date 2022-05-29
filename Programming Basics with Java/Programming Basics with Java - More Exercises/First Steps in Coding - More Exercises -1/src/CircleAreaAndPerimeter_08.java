import java.util.Scanner;

public class CircleAreaAndPerimeter_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberR = Double.parseDouble(scanner.nextLine());
        double SCircle = Math.PI * Math.pow(numberR, 2);
        double PCircle = 2 * Math.PI * numberR;
        System.out.printf("%.2f %n%.2f", SCircle, PCircle);
    }
}
