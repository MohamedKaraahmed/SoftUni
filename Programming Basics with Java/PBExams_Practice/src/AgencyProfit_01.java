import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int adultTicketsC = Integer.parseInt(scanner.nextLine());
        int kidTicketsC = Integer.parseInt(scanner.nextLine());
        double netAdultTicketPrice = Double.parseDouble(scanner.nextLine());
        double servicesPrice = Double.parseDouble(scanner.nextLine());

        double netKidsTicketPrice = netAdultTicketPrice * 0.30;


        double fullAdultsPr = netAdultTicketPrice + servicesPrice;
        double fullKidsPr = netKidsTicketPrice + servicesPrice;

        double sumAllTickets = (adultTicketsC * fullAdultsPr) + (kidTicketsC * fullKidsPr);
        double companyProfit = sumAllTickets * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, companyProfit);
    }
}
