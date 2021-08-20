package MidExam.E03MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class E02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // will receive a sequence with integers, separated by single space, representing targets and their value.
        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String commands = scanner.nextLine();
        int count = 0;

        while (!commands.equals("End")) {
            int indexTarget = Integer.parseInt(commands);
                  //проверка за валидност на масива
            if (indexTarget >= 0 && indexTarget < targets.length) {
                // you be receiving integers each on a single line – the index of the target to be shot.
                for (int i = 0; i < targets.length; i++) {
                    int temp = targets[indexTarget];
//Reduce all the other targets, which have greater values than your current target, with its value.
                    if (targets[i] != -1 && i != indexTarget) {
                        //Reduce all the other targets, which have greater values than your current target, with its value.
                        if (targets[i] > temp) {
                            targets[i] -= temp;
                        } else if (targets[i] < temp) {//All the targets, which have less than or equal value to the shot target,
                            // you need to increase with its value.
                            targets[i] += temp;
                        }
                    }
                }
                //Everytime you shoot a target, its value becomes -1 and it is considered shot.
                targets[indexTarget] = -1;
                count++;
            }
            commands = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> " + String.join(" "), count);

        for (int num : targets) {
            System.out.print(num + " ");
        }
    }
}
