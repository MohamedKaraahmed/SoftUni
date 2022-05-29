import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int stepsGoal = 10000;
        int allStepps = 0;
        while (!command.equals("Going home")) {
            int steps = Integer.parseInt(command);

            allStepps = allStepps + steps;
            if (allStepps > stepsGoal) {
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            allStepps = allStepps + stepsToHome;
        }
        if (allStepps > stepsGoal) {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", Math.abs(allStepps - stepsGoal));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(stepsGoal - allStepps));
        }
    }

}
