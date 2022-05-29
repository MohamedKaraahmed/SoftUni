import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int countPiecesFromWholeCake = length * width;

        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int piecesTaken = Integer.parseInt(command);
            countPiecesFromWholeCake = countPiecesFromWholeCake - piecesTaken;
            if (countPiecesFromWholeCake < 0) {

                break;
            }


            command = scanner.nextLine();
        }
        if (countPiecesFromWholeCake < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPiecesFromWholeCake));
        } else {
            System.out.printf("%d pieces are left.", Math.abs(countPiecesFromWholeCake));
        }
    }
}
