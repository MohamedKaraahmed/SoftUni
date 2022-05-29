import java.util.Scanner;

public class Sunglasses_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= 2*n ; i++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*n ; k++) {
                System.out.print("*");
            }
        System.out.println();
        for (int i = 1; i <= n - 2 ; i++) {
            System.out.print("*");
            for (int j = 1; j <= 2*n-2 ; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int j = 1; j <=n ; j++) {
                if ((n-1) / 2-1 ==j){
                    System.out.print("|");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//note1
//        for (int i = 1; i <= 2*n ; i++) {
//                System.out.print("*");
//                }
//                for (int j = 1; j <= n ; j++) {
//                System.out.print(" ");
//                }
//                for (int k = 1; k <= 2*n ; k++) {
//                System.out.print("*");
//                }
//                System.out.println();
//                for (int i = 1; i <= n - 2 ; i++) {
//                System.out.print("*");
//                for (int j = 1; j <= 2*n-2 ; j++) {
//                System.out.print("/");
//                }
//                System.out.print("*");
//                System.out.println();
//                }