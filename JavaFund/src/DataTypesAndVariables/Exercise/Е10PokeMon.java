package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Е10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int pokeTargetsM = Integer.parseInt(scanner.nextLine());
        int exhaustationFactorY = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int currentPokePower = pokePowerN;

        while (currentPokePower >= pokeTargetsM){


            currentPokePower -= pokeTargetsM;
            count++;

            if (currentPokePower == pokePowerN * 0.5 && exhaustationFactorY != 0) {
                currentPokePower /= exhaustationFactorY;
            }
        }
        System.out.println(currentPokePower);
        System.out.println(count);

    }
}
