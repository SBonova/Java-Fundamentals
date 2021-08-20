package DataTypesAndVariables.Exercise2;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfSnowballsN = Integer.parseInt(scanner.nextLine());

        int highestSnowballValue = Integer.MIN_VALUE;
        int snowballValue = 0;
        int snowballQuality1 = 0;
        int snow = 0;
        int time = 0;

        for (int i = 0; i < numberOfSnowballsN; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());


            // (snowballSnow / snowballTime) ^ snowballQuality
            snowballValue = (snowballSnow / snowballTime) * snowballQuality;
            if (snowballValue >= highestSnowballValue){
                highestSnowballValue = snowballValue;
                snowballQuality1 = snowballQuality;
                snow = snowballSnow;
                time = snowballTime;

            }
        }
        System.out.printf("%d : %d = %d (%d)",snow , time ,highestSnowballValue, snowballQuality1);


    }
}
