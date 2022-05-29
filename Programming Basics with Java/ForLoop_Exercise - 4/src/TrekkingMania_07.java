import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());


        double musalaPeople = 0;
        double montblanPeople = 0;
        double kilimandjaroPeople = 0;
        double k2People = 0;
        double everestPeople = 0;

        double allPeopleCount = 0;
        for (int i = 1; i <= groupsCount; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());

            allPeopleCount = allPeopleCount + peopleCount;

            if (peopleCount <= 5) {
                musalaPeople = musalaPeople + peopleCount;

            } else if (peopleCount <= 12) {
                montblanPeople = montblanPeople + peopleCount;

            } else if (peopleCount <= 25) {
                kilimandjaroPeople = kilimandjaroPeople + peopleCount;

            } else if (peopleCount <= 40) {
                k2People = k2People + peopleCount;

            } else {
                everestPeople = everestPeople + peopleCount;
            }
        }
        double musalaPeoplePercent = musalaPeople / allPeopleCount * 100;
        double montblanPeoplePercent = montblanPeople / allPeopleCount * 100;
        double kilimandjaroPeoplePercent = kilimandjaroPeople / allPeopleCount * 100;
        double k2PeoplePercent = k2People / allPeopleCount * 100;
        double everestPeoplePercent = everestPeople / allPeopleCount * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", musalaPeoplePercent, montblanPeoplePercent, kilimandjaroPeoplePercent, k2PeoplePercent, everestPeoplePercent);
    }
}
