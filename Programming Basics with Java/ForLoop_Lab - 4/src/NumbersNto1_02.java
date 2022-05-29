import java.util.Scanner;

public class NumbersNto1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //1-nachalo - ot n
        //2- do 1
        //3- pechatame chislata
        //4- izmenqme s -1
        for (int number = n; number >= 1; number--) {
            System.out.println(number);
        }

    }
}
