
public class Clock_01 {
    public static void main(String[] args) {


        for (int hours = 0; hours <= 23; hours++) {
            for (int min = 0; min <= 59; min++) {

                System.out.printf("%s:%s%n", hours, min);
            }
        }
    }
}
