import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // povtarqme: vavejdame vhodni danni
        // spiram: kogato vuvedeniq red e NoMoreMoney
        //produljavam: kogato vuvedeniq red ne e NoMoreMoney

        String input = scanner.nextLine();//NoMoreMoney ili drobno chislo pod formata na tekst
        double totalMoney = 0;//pari v smetkata

        while (!input.equals("NoMoreMoney")) {
            // input e drobni chisla pod formata na tekst
            // sumata

            double sum = Double.parseDouble(input);
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", sum);
                totalMoney = totalMoney + sum;
            }
            //proverka dali sumata e < 0 -> pechatame + break
            // sumata >= 0 -> pechatame i dobavqme kum smetkata


            input = scanner.nextLine();

        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
