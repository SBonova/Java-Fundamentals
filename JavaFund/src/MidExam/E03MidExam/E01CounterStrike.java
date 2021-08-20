package MidExam.E03MidExam;

import java.util.Scanner;

public class E01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will receive initial energy.
        int energy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int count = 0;

      // until the "End of battle" command is given, or until you run out of energy.
        while (!command.equals("End of battle")) {
          //  Afterwards you will start receiving the distance you need to go to reach an enemy
            int distanceOfTheEnemy = Integer.parseInt(command);

            //If you don't have enough energy to reach an the enemy, print:
            if (energy < distanceOfTheEnemy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", count, energy);
                return;
            } else {//The energy you need for reaching an enemy is equal to the distance you receive.
              // Each time you reach an enemy, your energy is reduced.
                energy -= distanceOfTheEnemy;
                count++;
                //Every third won battle increases your energy with the value of your current count of won battles.
                if (count % 3 == 0) {
                    energy += count;
                }

//                if (energy >= distance) {
//                    energy -= distance;
//                    countOfWonBattles ++;
//                }else {
//                    System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countOfWonBattles, energy);
//                    return;
//                }
            }
            command = scanner.nextLine();
        }
            System.out.printf("Won battles: %d. Energy left: %d", count, energy);
    }
}
