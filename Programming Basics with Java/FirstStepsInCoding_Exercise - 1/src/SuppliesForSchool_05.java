import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensPacket= Integer.parseInt(scanner.nextLine());
        int markersPacket= Integer.parseInt(scanner.nextLine());
        int litersAbstergent= Integer.parseInt(scanner.nextLine());
        int discountPercent= Integer.parseInt(scanner.nextLine());

        double pens=pensPacket* 5.80;
        double markers=markersPacket*7.20;
        double abstergent=litersAbstergent*1.20;
        double sum = pens+markers+abstergent;
        double sumWithDiscount= sum-(sum * (discountPercent/100.0));

        System.out.println(sumWithDiscount);

    }
}



//        double pens = 5.80;
//        double markers= 7.20;
//        double abstergentPerLiter= 1.20;
