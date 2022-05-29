import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int addedWater = 0;
        for (int i = 1; i <= n; i++) {
            int litersWater = Integer.parseInt(scanner.nextLine());
            if (addedWater + litersWater > 255) {
                System.out.println("Insufficient capacity!");
            }
            if (addedWater + litersWater <= 255) {
                addedWater += litersWater;
            }
        }
        System.out.println(addedWater);
    }
}