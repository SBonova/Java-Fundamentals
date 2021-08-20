package Exam10072021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] tokens = command.split(" ");
            String input = tokens[0];
            String value = tokens[1];
            switch (input) {
                case "Add":

                    numbers.add(value);

                    break;
                case "Remove":

                    for (int i = 0; i < numbers.size(); i++) {
                        String element = numbers.get(i);
                        if (element.equals(value)) {
                            numbers.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    String replacement = tokens[2];

                    for (int i = 0; i < numbers.size(); i++) {
                        String element = numbers.get(i);
                        if (element.equals(value)) {
                            numbers.remove(i);
                            numbers.add(i, replacement);
                            break;
                        }
                    }
                    break;

                case "Collapse":
                    for (int i = 0; i < numbers.size(); i++) {
                        int value1 = Integer.parseInt(tokens[1]);
                        int element = Integer.parseInt(numbers.get(i));

                        if (element < value1) {
                            numbers.remove(i);
                        }
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", numbers));
    }
}

