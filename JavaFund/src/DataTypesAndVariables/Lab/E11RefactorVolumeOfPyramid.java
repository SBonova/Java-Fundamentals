package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class E11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
       // System.out.printf("Length: %f%n", length);

        double width = Double.parseDouble(scanner.nextLine());
      //  System.out.printf("Width: %f%n", width);

        double height = Double.parseDouble(scanner.nextLine());
     //   System.out.printf("Height: %f%n", height);

        double volume = (length * width * height) / 3;
        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f%n", volume);
    }
}
