import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedP = 0;
        int untreatedP = 0;

        for (int day = 1; day <= period; day++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (day % 3 == 0 && untreatedP > treatedP) {
                // pri vseki 3ti den
                doctors++;
                if (patients <= doctors) {
                    treatedP = treatedP + patients;
                } else {
                    treatedP = treatedP + doctors;
                    untreatedP = untreatedP + (patients - doctors);
                }
                continue;
            }
            if (patients <= doctors) {
                treatedP = treatedP + patients;

            } else {
                treatedP = treatedP + doctors;
                untreatedP = untreatedP + (patients - doctors);
            }

        }
        System.out.printf("Treated patients: %d.%n", treatedP);
        System.out.printf("Untreated patients: %d.", untreatedP);
    }
}
