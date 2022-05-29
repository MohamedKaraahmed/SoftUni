public class Rectangle10x10Stars_01 {
    public static void main(String[] args) {

        for (int rows = 1; rows <= 10; rows++) {
            for (int columns = 1; columns <= 10; columns++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
