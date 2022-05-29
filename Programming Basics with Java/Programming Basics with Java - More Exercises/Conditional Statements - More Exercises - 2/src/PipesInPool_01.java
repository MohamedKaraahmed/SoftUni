import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poolV = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hAbsence = Double.parseDouble(scanner.nextLine());

        double allWater = (p1 * hAbsence) + (p2 * hAbsence);
        if (allWater<= poolV) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", (allWater/poolV)*100,((p1*hAbsence)/allWater)*100,
                    ((p2*hAbsence)/allWater)*100);
        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hAbsence,(allWater-poolV));

        }
    }
}
