import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalTickets = 0;

        String input = scanner.nextLine();
        int allStudentTickets = 0;
        int allStandardTickets = 0;
        int allKidsTickets = 0;
        while (!input.equals("Finish")) {
            int studentTicketsCount = 0;
            int standardTicketsCount = 0;
            int kidsTicketsCount = 0;

            boolean isFinish = false;
            int ticketsForCurrentMovie = 0;
            String movieName = input;
            int availableSeats = Integer.parseInt(scanner.nextLine());

            String typeTicket = scanner.nextLine();

            while (!typeTicket.equals("End")) {

                if (typeTicket.equals("Finish")) {
                    isFinish = true;
                    break;
                }

                if (typeTicket.equals("student")) {
                    studentTicketsCount++;
                }
                if (typeTicket.equals("standard")) {
                    standardTicketsCount++;
                }
                if (typeTicket.equals("kid")) {
                    kidsTicketsCount++;
                }
                ticketsForCurrentMovie = standardTicketsCount + studentTicketsCount + kidsTicketsCount;

                if (availableSeats <= ticketsForCurrentMovie) {

                    break;
                }
                typeTicket = scanner.nextLine();


            }
            allStudentTickets += studentTicketsCount;
            allStandardTickets += standardTicketsCount;
            allKidsTickets += kidsTicketsCount;

            totalTickets = totalTickets + studentTicketsCount + standardTicketsCount + kidsTicketsCount;
            System.out.printf("%s - %.2f%% full.%n", movieName, (ticketsForCurrentMovie * 1.0 / availableSeats) * 100);


            if (isFinish) {
                break;
            }

            input = scanner.nextLine();


        }
        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", allStudentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", allStandardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", allKidsTickets * 1.0 / totalTickets * 100);
    }
}