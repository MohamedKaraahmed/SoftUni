public class ClockPart2_10 {
    public static void main(String[] args) {
        for (int hours = 0; hours <= 23; hours++) {
            for (int mins = 0; mins <= 59; mins++) {
                for (int seconds = 0; seconds <= 59; seconds++) {
                    System.out.printf("%d : %d : %d %n", hours, mins, seconds);
                }
            }
        }
    }
}
