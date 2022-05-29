import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xHouseHeight = Double.parseDouble(scanner.nextLine());
        double yLengthSideWall = Double.parseDouble(scanner.nextLine());
        double hHeightRoofTriangle = Double.parseDouble(scanner.nextLine());

//        sides sum
        double areaY = xHouseHeight * yLengthSideWall;
        double bothSides = 2 * areaY - 2 * 2.25;
        double backWall = xHouseHeight * xHouseHeight;
        double frontBackWalls = 2 * backWall - 2.4;
        double allSidesArea = bothSides + frontBackWalls;
        double greenPaint = allSidesArea / 3.4;
//        roof sum
        double bothRoofRectangles = 2 * (xHouseHeight * yLengthSideWall);
        double bothRoofTriangles = 2 * (xHouseHeight * hHeightRoofTriangle / 2);
        double RoofArea = bothRoofRectangles + bothRoofTriangles;
        double redPaint = RoofArea / 4.3;

        System.out.printf("%.2f %n%.2f", greenPaint, redPaint);


    }
}
