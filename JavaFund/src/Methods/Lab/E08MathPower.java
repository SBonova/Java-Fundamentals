package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = getMathPower(num, power);
        System.out.println(new DecimalFormat("0.####").format(result));

    }

    private static double getMathPower(double num, int power){
        double result = 1;

        result = Math.pow(num,power);

        return result;
    }
}
