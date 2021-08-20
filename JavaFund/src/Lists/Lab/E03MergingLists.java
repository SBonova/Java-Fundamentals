package Lists.Lab;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>firstList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>secondList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //с тази функция взема по-малкия лист
        int smallListSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < smallListSize; i++) {
            System.out.print(firstList.get(i) + " " + secondList.get(i) + " ");
        }
        printTheRest(firstList, smallListSize);
        printTheRest(secondList, smallListSize);
    }

    private static void printTheRest(List<Integer> list, int beginIndex) {
        for (int i = beginIndex; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
