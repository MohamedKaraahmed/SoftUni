import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lengthM = Double.parseDouble(scanner.nextLine());
        double widthM = Double.parseDouble(scanner.nextLine());

        double lengthCm = lengthM * 100;
        double widthCm = (widthM * 100) - 100;

        int deskOnRow = (int) Math.abs(widthCm / 70);
        int placesCount = (int) Math.abs(lengthCm / 120);
        double allPlaces = deskOnRow * placesCount - 3;


        System.out.printf("%.0f", allPlaces);

    }
}
