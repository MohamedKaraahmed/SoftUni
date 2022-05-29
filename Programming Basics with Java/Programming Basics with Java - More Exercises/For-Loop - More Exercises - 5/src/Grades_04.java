import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        int topStudents = 0;
        int between4And499 = 0;
        int between3And399 = 0;
        int fail = 0;
        double average = 0;

        for (int i = 1; i <= countStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            average += grade;
            if (grade >= 2.00 && grade <= 2.99) {
                fail++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                between3And399++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                between4And499++;
            } else if (grade >= 5.00) {
                topStudents++;
            }
        }
        double topStudentsPercent = topStudents * 1.0 / countStudents * 100;
        double between4And499Percent = between4And499 * 1.0 / countStudents * 100;
        double between3And399Percent = between3And399 * 1.0 / countStudents * 100;
        double failPercent = fail * 1.0 / countStudents * 100;

        System.out.printf("Top students: %.2f%%%n", topStudentsPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between4And499Percent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between3And399Percent);
        System.out.printf("Fail: %.2f%%%n", failPercent);
        System.out.printf("Average: %.2f", average / countStudents);
    }
}
