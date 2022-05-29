import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //1 nachalo- chetnite stepeni ot 0 do n
        //2krai-n
        //3povtarqshto deistvie- pechatame dve na stepen
        //4 izmenqme s -
        for (int step = 0; step <= n; step += 2) {
            // 2 na stepen step
            System.out.println(Math.pow(2, step));

        }
    }
}
