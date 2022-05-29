import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int satisfactoryGrades = Integer.parseInt(scanner.nextLine());

        int countPoorGrades = 0;
        int numberOfProblems = 0;
        double sumOFGrades = 0;
        String lastProblem = "";

        String command = scanner.nextLine();

        while (!command.equals("Enough")) {
            String currentProblem = command;
            int grade = Integer.parseInt(scanner.nextLine());


            if (grade <= 4) {
                countPoorGrades++;
            }
            if (countPoorGrades >= satisfactoryGrades) {
                break;
            }

            sumOFGrades = sumOFGrades + grade;
            numberOfProblems++;
            lastProblem = currentProblem;
            command = scanner.nextLine();

        }
        if (countPoorGrades >= satisfactoryGrades) {
            System.out.printf("You need a break, %d poor grades.", countPoorGrades);
        } else {

            System.out.printf("Average score: %.2f%n", sumOFGrades / numberOfProblems);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s%n", lastProblem);
        }

    }
}

