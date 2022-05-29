import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        boolean wasFound = false;
        String command = scanner.nextLine();
        int chechedBooks = 0;

        while (!command.equals("No More Books")) {
            String currentBook = command;

            if (searchedBook.equals(currentBook)) {
                wasFound = true;
                break;
            }

            chechedBooks++;
            command = scanner.nextLine();

        }
        if (wasFound) {
            System.out.printf("You checked %d books and found it.", chechedBooks);

        } else {
            System.out.printf("The book you search is not here! %nYou checked %d books.", chechedBooks);
        }
    }
}
