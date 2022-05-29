import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int q = 0;
        int w = 0;
        int e = 0;
        int r = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if ((a * b) + (c * d) == m) {
                            if (a < b && c > d) {
                                count++;
                                System.out.printf("%s%s%s%s ", a, b, c, d);
                                if (count == 4) {
                                    q = a;
                                    w = b;
                                    e = c;
                                    r = d;
//                                    System.out.printf("Password: %s%s%s%s", a, b, c, d);
                                }

                            }
                        }
                    }
                }
            }
        }
        if (count >= 4) {
            System.out.printf("%nPassword: %s%s%s%s ", q, w, e, r);
        } else {
            System.out.println("");
            System.out.println("No!");
        }
    }
}
//if (count > 0 && count < 4){
//        System.out.println("No!");
//        }
//  System.out.printf("Password: %s%s%s%s ",a,b,c,d);