import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double squareArea = a * a;
            System.out.printf("%.3f", squareArea);

        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double rectangleArea = a * b;
            System.out.printf("%.3f",rectangleArea);

        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double circleArea = (r * r) * Math.PI;
            System.out.printf("%.3f",circleArea);

        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double triangleArea = (a * h) / 2;
            System.out.printf("%.3f",triangleArea);
        }

    }
}
