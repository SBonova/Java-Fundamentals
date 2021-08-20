package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The number of snowballs (N) will be an integer in range [0, 100].
        //и заради реинджа е byte
        byte n = Byte.parseByte(scanner.nextLine());
        int highestSnowballValue = Integer.MIN_VALUE;

        int snowballQuality = 0;
        int snow = 0;
        int time = 0;
        for (int i = 0; i < n ; i++) {
            //    • The snowballSnow is an integer in range [0, 1000].
            //    • The snowballTime is an integer in range [1, 500].
            //заради рейнджа са short
            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            //The snowballQuality is an integer in range [0, 100].
            // заради реинджа е byte
            byte snowballlQuality = Byte.parseByte(scanner.nextLine());

            int snowballValue = (int) Math.pow(snowballSnow/snowballTime, snowballlQuality);
            if (snowballValue >= highestSnowballValue){
                highestSnowballValue = snowballValue;
                snowballQuality = snowballlQuality;
                snow=snowballSnow;
                time=snowballTime;
            }
        }
        System.out.printf("%d : %d = %d (%d)", snow, time, highestSnowballValue, snowballQuality);

    }
}
