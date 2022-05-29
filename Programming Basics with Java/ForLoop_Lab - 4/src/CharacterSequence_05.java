import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        //1nachalo - ot purviq simvol na teksta
        //2krai- do posledniq simvol na teksta
        //3povtarqme- pechatame simvoli
        //4izmenqme s- edna poziciq v teksta
        for (int position = 0; position <= text.length()-1; position++) {
            char symbol = text.charAt(position);
            System.out.println(symbol);
        }
    }
}
