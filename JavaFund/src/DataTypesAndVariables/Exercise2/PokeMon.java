package DataTypesAndVariables.Exercise2;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceBetweenPokeTargetsM = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactorY = (byte) Integer.parseInt(scanner.nextLine());
        int count = 0;
      //  int currPokeMonPower = pokePowerN;

       while(pokePowerN >= distanceBetweenPokeTargetsM) {

           pokePowerN -= distanceBetweenPokeTargetsM;
           count++;

           if (pokePowerN == pokePowerN * 0.5 && exhaustionFactorY != 0) {
               pokePowerN /= exhaustionFactorY;
           }
       }
        System.out.println(pokePowerN);
        System.out.println(count);

    }
}
