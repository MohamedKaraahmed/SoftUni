import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length  = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());


        double aquariumVolume = length * width * height;
        double volumeInLiters = aquariumVolume / 1000;
        double waterNeeded = volumeInLiters * (1 -(percent/100));
        System.out.println(waterNeeded);




    }
}
