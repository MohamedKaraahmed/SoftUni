import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsFood = Integer.parseInt(scanner.nextLine());
        int catsFood = Integer.parseInt(scanner.nextLine());
        double sum= (dogsFood *2.50)+ (catsFood * 4.00);
        System.out.println(sum +" " + "lv.");

    }
}
