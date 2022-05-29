import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());//N
        int distance = Integer.parseInt(scanner.nextLine());//M
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());//Y
        int count = 0;
        int originalNValue = pokePower;
        while (pokePower >= distance) {
            pokePower -= distance;
            count++;
            if (pokePower == originalNValue * 0.5) {
                if (exhaustionFactor > 0) {
                    pokePower = pokePower / exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(count);
    }
}
