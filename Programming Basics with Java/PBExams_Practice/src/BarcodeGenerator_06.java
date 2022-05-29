import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            int currentNum = i;

            for (int j = 4; j >=1 ; j--) {
                int lastNum = currentNum % 10;
                currentNum = currentNum / 10;
                if (lastNum % 2 ==1){
                    System.out.printf("%d",lastNum);
                }

            }
            System.out.println( );


        }
    }
}
