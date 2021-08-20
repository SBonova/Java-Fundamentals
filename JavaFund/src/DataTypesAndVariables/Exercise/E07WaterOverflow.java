package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalLitters = 0;

        for (int i = 0; i < n; i++) {
            int currentLitters = Integer.parseInt(scanner.nextLine());

            if (currentLitters + totalLitters > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                totalLitters += currentLitters;
            }
        }
        System.out.println(totalLitters);
    }
}
