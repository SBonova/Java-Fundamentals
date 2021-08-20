package MidExam.E04MidExam.E04MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class E03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will receive a string with even integers, separated by a "@". This is our neighborhood.
        int[] house = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String commandJump = scanner.nextLine();

        int houseNomber = 0;


        while (!commandJump.equals("Love!")) {
            //входните данни ги прави на масив от стрингове ["Jump", "1"]
            String[] hearts = commandJump.split("\\s+");
            //прочита елемента на първа позиция
            int jumpLenght = Integer.parseInt(hearts[1]);

            houseNomber = houseNomber + jumpLenght;

            //проверка, дали неизлиза от масива и ако излиза да започне пак от 0
            if (houseNomber >= house.length) {
                houseNomber = 0;
            }
            //Every time he jumps from one house to another, the needed hearts for the visited house are decreased by 2.
            if (house[houseNomber] != 0) {
                house[houseNomber] -= 2;
              //  If the needed hearts for a certain house become equal to 0
                if (house[houseNomber] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", houseNomber);
                }
            } else {//If Cupid jumps to a house where the needed hearts are already 0, print on the console "Place {houseIndex} already had Valentine's day.".
                System.out.printf("Place %d already had Valentine's day.%n", houseNomber);
            }
            commandJump = scanner.nextLine();
        }

        //At the end print Cupid's last position and whether his mission was successful or not:
        System.out.printf("Cupid's last position was %d.%n", houseNomber);

        boolean isSuccsess = true;

        for (int number : house) {
            if (number != 0) {
                isSuccsess = false;
                break;
            }
        }
        int count = 0;
        for (int number:house) {
            if (number != 0){
                count++;
            }
        }
        if (isSuccsess){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.", count);
        }
    }
}
