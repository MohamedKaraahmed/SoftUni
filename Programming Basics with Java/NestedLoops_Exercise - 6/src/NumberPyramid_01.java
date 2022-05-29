import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 0;
        boolean isFound = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                currentNum++;

                if (currentNum > n) {
                    isFound = true;
                    break;
                }
                System.out.printf("%d ", currentNum);

            }
            if (isFound) {
                break;
            }
            System.out.println();
        }
    }
}
