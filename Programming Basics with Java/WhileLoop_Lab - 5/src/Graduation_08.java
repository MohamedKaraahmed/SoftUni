import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        int badGrade = 0;
        int countClasses = 0;
        double allGrades = 0;

        while (countClasses != 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                badGrade++;
                if (badGrade > 1) {

                    break;
                }
            }
            allGrades = allGrades + grade;
            countClasses++;

        }
        double averageGrade = allGrades / countClasses;
        if (countClasses == 12) {

            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", studentName, countClasses);
        }
    }
}
