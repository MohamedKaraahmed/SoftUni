import java.util.Scanner;

public class Number1ToNWithStep3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //1-Nachalo-1
        //2-Krai-n
        //3-povtarqshto deistvie- otpechatva chisla
        //4-s kolko izmenqme- prez 3
        for (int number = 1; number <= n; number += 3) {
            System.out.println(number);
        }

    }
}
