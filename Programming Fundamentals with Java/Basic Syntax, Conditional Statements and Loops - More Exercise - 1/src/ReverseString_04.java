import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            char digit = input.charAt(i);
            word = word + digit;
        }
        System.out.println(word);
    }
}
