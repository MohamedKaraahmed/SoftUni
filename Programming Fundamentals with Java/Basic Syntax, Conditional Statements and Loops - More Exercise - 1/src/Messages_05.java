import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String letters = "";
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            switch (currentNum) {
                case 2:
                    letters = letters + 'a';
                    break;
                case 22:
                    letters = letters + 'b';
                    break;
                case 222:
                    letters = letters + 'c';
                    break;
                case 3:
                    letters = letters + 'd';
                    break;
                case 33:
                    letters = letters + 'e';
                    break;
                case 333:
                    letters = letters + 'f';
                    break;
                case 4:
                    letters = letters + 'g';
                    break;
                case 44:
                    letters = letters + 'h';
                    break;
                case 444:
                    letters = letters + 'i';
                    break;
                case 5:
                    letters = letters + 'j';
                    break;
                case 55:
                    letters = letters + 'k';
                    break;
                case 555:
                    letters = letters + 'l';
                    break;
                case 6:
                    letters = letters + 'm';
                    break;
                case 66:
                    letters = letters + 'n';
                    break;
                case 666:
                    letters = letters + 'o';
                    break;
                case 7:
                    letters = letters + 'p';
                    break;
                case 77:
                    letters = letters + 'q';
                    break;
                case 777:
                    letters = letters + 'r';
                    break;
                case 7777:
                    letters = letters + 's';
                    break;
                case 8:
                    letters = letters + 't';
                    break;
                case 88:
                    letters = letters + 'u';
                    break;
                case 888:
                    letters = letters + 'v';
                    break;
                case 9:
                    letters = letters + 'w';
                    break;
                case 99:
                    letters = letters + 'x';
                    break;
                case 999:
                    letters = letters + 'y';
                    break;
                case 9999:
                    letters = letters + 'z';
                    break;
                case 0:
                    letters = letters + " ";
                    break;
            }

        }
        System.out.println(letters);
    }
}
