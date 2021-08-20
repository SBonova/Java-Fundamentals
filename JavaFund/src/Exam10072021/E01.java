package Exam10072021;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperienceAmount = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());
        double collected = 0;

        for (int i = 1; i <= countOfBattles; i++) {
            double experience = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0) {
                collected = collected + experience * 0.15;
            }
            if (i % 5 == 0) {
                collected = collected - experience * 0.10;
            }

            if (i % 15 == 0) {
                collected = collected + experience * 0.05;
            }
            if (i > 0) {
                collected += experience;
            }


            if (collected >= neededExperienceAmount) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                break;
            }


        }
        if (collected < neededExperienceAmount) {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperienceAmount - collected);
        }
    }
}
