package Methods.Lab;

import java.util.Scanner;

public class E06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        //връща изчислението area от метода getRectangleArea
        double area = getRectangleArea(width, length);
        System.out.printf("%.0f",area);
    }


    //когато икаме да връща и да взема нещо от метода и да го прекъсне пишем типа данни
    //и тогава името на метода и в скобите подаваме параметрите
    public static double getRectangleArea(double width, double length) {
        double rectangleArea = width * length;
        //го връща и го спира
        return rectangleArea;
    }
}
