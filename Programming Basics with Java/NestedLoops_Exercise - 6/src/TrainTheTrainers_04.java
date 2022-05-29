import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judgePeopleCount = Integer.parseInt(scanner.nextLine());
        double gradeSum = 0;
        int gradesCount = 0;
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            String currentPresentation = input;

            double currentPresentationGradeAvg = 0;

            int currentGradeCounts = 0;
            for (int i = 1; i <= judgePeopleCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum = gradeSum + grade;
                gradesCount++;
                currentGradeCounts++;
                currentPresentationGradeAvg = currentPresentationGradeAvg + grade;

            }
            System.out.printf("%s - %.2f.%n", currentPresentation, currentPresentationGradeAvg / currentGradeCounts);


            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", gradeSum / gradesCount);
    }
}
