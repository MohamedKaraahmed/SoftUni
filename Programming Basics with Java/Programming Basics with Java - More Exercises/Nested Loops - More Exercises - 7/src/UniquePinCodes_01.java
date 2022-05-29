import java.util.Scanner;

public class UniquePinCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstBorder = Integer.parseInt(scanner.nextLine());
        int secondBorder = Integer.parseInt(scanner.nextLine());
        int thirdBorder = Integer.parseInt(scanner.nextLine());


        for (int firstNum = 2; firstNum <= firstBorder; firstNum += 2) {

            for (int secondNum = 1; secondNum <= secondBorder; secondNum++) {
                if (secondNum == 2 || secondNum == 3 || secondNum == 5 || secondNum == 7) {

                    for (int thirdNum = 2; thirdNum <= thirdBorder; thirdNum += 2) {
                        System.out.print(firstNum + " " + secondNum + " " + thirdNum);
                        System.out.println();
                    }
                }


            }
        }

    }
}
