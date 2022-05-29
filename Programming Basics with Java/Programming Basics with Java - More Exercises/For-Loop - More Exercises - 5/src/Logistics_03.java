import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLoad = Integer.parseInt(scanner.nextLine());
        double minibusTons = 0;
        double truckTons = 0;
        double trainTons = 0;
        double sumOfAllLoads = 0;
        double averageForTon = 0;
        for (int i = 1; i <= countLoad; i++) {
            int loadTons = Integer.parseInt(scanner.nextLine());
            if (loadTons <= 3) {
                minibusTons += loadTons;
            } else if (loadTons <= 11) {
                truckTons += loadTons;
            } else {
                trainTons += loadTons;
            }
            sumOfAllLoads = minibusTons + truckTons + trainTons;
        }
        averageForTon = ((minibusTons * 200) + (truckTons * 175) + (trainTons * 120)) / sumOfAllLoads;
        minibusTons = minibusTons / sumOfAllLoads * 100;
        truckTons = truckTons / sumOfAllLoads * 100;
        trainTons = trainTons / sumOfAllLoads * 100;
        System.out.printf("%.2f%n", averageForTon);
        System.out.printf("%.2f%%%n", minibusTons);
        System.out.printf("%.2f%%%n", truckTons);
        System.out.printf("%.2f%%", trainTons);
    }

}

