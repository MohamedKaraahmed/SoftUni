import java.util.Scanner;

public class House_09 {
    public static <object> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int star ;
        int underline;

        if (n % 2 == 0) {
            star = 2;
        } else {
            star = 1;
        }
        String s = String.valueOf(star);
       
    }
}


// if (n % 2 == 0) {
//         for (int i = 1; i <=(n-2)/2 ; i++) {
//         System.out.print("_");
//         }
//         System.out.print("**");
//         for (int i = 1; i <=(n-2)/2 ; i++) {
//         System.out.print("_");
//         }
//         } else {
//         for (int i = 1; i <=(n-1)/2 ; i++) {
//         System.out.print("_");
//         }
//         System.out.print("*");
//         for (int i = 1; i <=(n-1)/2 ; i++) {
//         System.out.print("_");
//         }
//         }