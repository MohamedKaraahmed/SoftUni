import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fansCount = Integer.parseInt(scanner.nextLine());
        int aSector = 0;
        int bSector = 0;
        int vSector = 0;
        int gSector = 0;

        for (int i = 1; i <= fansCount; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A": {
                    aSector++;
                    break;
                }
                case "B": {
                    bSector++;
                    break;
                }
                case "V": {
                    vSector++;
                    break;
                }
                case "G": {
                    gSector++;
                    break;
                }
                default:
                    break;
            }
        }
        int allFans = aSector + bSector + vSector + gSector;
        System.out.printf("%.2f%%%n", aSector * 1.0 / fansCount * 100);
        System.out.printf("%.2f%%%n", bSector * 1.0 / fansCount * 100);
        System.out.printf("%.2f%%%n", vSector * 1.0 / fansCount * 100);
        System.out.printf("%.2f%%%n", gSector * 1.0 / fansCount * 100);
        System.out.printf("%.2f%%%n", allFans * 1.0 / stadiumCapacity * 100);
    }
}
