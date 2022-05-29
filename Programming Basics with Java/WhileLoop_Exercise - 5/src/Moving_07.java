import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());
        int availableFreeSpace = widthFreeSpace * lengthFreeSpace * heightFreeSpace;
        int takenSpace = 0;

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int spaceTaking = Integer.parseInt(command);

            takenSpace = takenSpace + spaceTaking;
            if (availableFreeSpace < takenSpace) {
                break;
            }
            command = scanner.nextLine();
        }
        if (availableFreeSpace > takenSpace) {
            System.out.printf("%d Cubic meters left.", Math.abs(availableFreeSpace - takenSpace));
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableFreeSpace - takenSpace));
        }

    }
}
