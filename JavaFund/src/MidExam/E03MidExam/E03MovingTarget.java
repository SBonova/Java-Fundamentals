package MidExam.E03MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//On the first line, you will receive a sequence of targets with their integer values, split by a single space.
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

//Then, you will start receiving commands for manipulating the targets, until the "End" command.
        String comand = scanner.nextLine();

        while (!comand.equals("End")) {
            //входните данни ги прави на масив от стрингове
            String[] arrayComands = comand.split("\\s+");

            int index = Integer.parseInt(arrayComands[1]);

            switch (arrayComands[0]) {
                case "Shoot":
                    int power = Integer.parseInt(arrayComands[2]);
                    if (isValidIndex(index, targets.size() - 1)) {
                        listAfterShootComand(targets, index, power);
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(arrayComands[2]);
                    if (isValidRadius(targets, index, radius)) {
                        listAfterStrikeCommand(targets, index, radius);
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(arrayComands[2]);
                    if (isValidIndex(index, targets.size() - 1)) {
                        targets.set(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
            }
            comand = scanner.nextLine();
        }
        printList(targets);
    }

    private static void printList(List<Integer> targets) {
        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }
        }
    }

    private static boolean isValidRadius(List<Integer> targets, int index, int radius) {
        return index - radius >= 0 && index + radius < targets.size();
    }

    private static void listAfterStrikeCommand(List<Integer> targets, int index, int radius) {
        for (int i = 1; i <= radius; i++) {
            targets.remove(index - i);
            targets.remove(index);
            index--;
        }
        targets.remove(index);
    }

    private static boolean isValidIndex(int index, int i) {
        return index >= 0 && index <= i;
    }

    private static void listAfterShootComand(List<Integer> targets, int index, int power) {
        int currentNumber = targets.get(index);
        currentNumber -= power;
        if (currentNumber <= 0) {
            targets.remove(index);
        } else {
            targets.set(index, currentNumber);
        }

    }
}
