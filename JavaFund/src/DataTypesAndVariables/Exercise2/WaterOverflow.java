package DataTypesAndVariables.Exercise2;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // int waterTank = 255;


        int litersOfWater = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < litersOfWater; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());

            if (sum + quantities > 255){
                System.out.printf("Insufficient capacity!%n");
            }else {
                sum += quantities;
            }
        }
        System.out.println(sum);
    }
}
