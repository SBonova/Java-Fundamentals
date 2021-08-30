package FinalExam14082021;

import java.util.Scanner;

public class Decripting_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String input = scanner.nextLine();
        StringBuilder message = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String[] tokens = command.split(" ");
            String commands = tokens[0];

            switch (commands) {
                case "Replace":
                    String currentChar = tokens[1];
                    String newChar = tokens[2];

                    String replace = message.toString();
                    replace = replace.replaceAll(currentChar, newChar);
                    message = new StringBuilder(replace);
                    System.out.println(message);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);

                    if (startIndex > 0 && endIndex < message.length()) {
                        message.delete(startIndex, endIndex + 1);
                        System.out.println(message);
                    } else {
                        System.out.println("Invalid indices!");
                    }

                    break;
                case "Make":
                    String upperLower = tokens[1];

                    if (upperLower.equals("Upper")) {
                        for (int i = 0; i < message.length(); i++) {
                            if (Character.isLowerCase(message.charAt(i))) {
                                message.setCharAt(i, Character.toUpperCase(message.charAt(i)));
                            }
                        }
                    } else if (upperLower.equals("Lower")) {
                        for (int i = 0; i < message.length(); i++) {
                            if (Character.isUpperCase(message.charAt(i))) {
                                message.setCharAt(i, Character.toLowerCase(message.charAt(i)));
                            }
                        }
                    }
                    System.out.println(message);

                    break;
                case "Check":
                    String text = tokens[1];

                    if (message.toString().contains(text)) {
                        System.out.println(message.toString());
                        System.out.printf("Message contains %s", text);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", text);
                    }
                    break;

                case "Sum":

                    int startIndexSum = Integer.parseInt(tokens[1]);
                    int endIndexSum = Integer.parseInt(tokens[2]);


                   if (startIndexSum > 0 && endIndexSum < message.length()) {
                        int sumACI = 0;
                               for (int i = startIndexSum; i <= endIndexSum; i++) {
                                   sumACI = sumACI + message.charAt(i);
                               }
                       System.out.println(sumACI);

                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}

