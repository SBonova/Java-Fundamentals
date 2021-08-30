package FinalExamTask.ProgrammingFundamentalsFinalExamRetake_03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //On the first line of the input you will receive the concealed message.
        String input = scanner.nextLine();

        //After that, until the "Reveal" command is given, you will be receiving strings with instructions for
        // different operations that need to be performed upon the concealed message in order to interpret it and reveal its true content.
        // There are several types of instructions, split by ":|:"
        String[] task = scanner.nextLine().split(":\\|:");

        while (!task[0].equals("Reveal")) {
            switch (task[0]) {

                case ("ChangeAll")://ChangeAll:|:{substring}:|:{replacement}
                    //Changes all occurrences of the given substring with the replacement text.
                    input = input.replace(task[1], task[2]);

                    System.out.println(input);

                    break;

                case ("InsertSpace")://InsertSpace:|:{index}
                    //Inserts a single empty space at the given index. The given index will always be valid.
                    int index = Integer.parseInt(task[1]);

                    input = input.substring(0, index) + " " + input.substring(index, input.length());

                    System.out.println(input);

                    break;
//                    StringBuilder result = new StringBuilder();
//                for (int i = 0; i < input.length(); i++) {
//                    if (i > 0) {
//                        result.append(" ");
//                    }
//
//                    result.append(input.charAt(i));
//                }
//
//                System.out.println(result.toString());

                case ("Reverse")://Reverse:|:{substring}

                    String substring = task[1];

                    //If the message contains the given substring, cut it out, reverse it and add it at the end of the message.
                    if (input.contains(substring)) {

                        String forReplays = new StringBuilder(substring).reverse().toString();

                        //This operation should replace only the first occurrence of the given substring if there are more than one such occurrences.
                        input = input.replaceFirst(Pattern.quote(substring), "") + forReplays;

                        System.out.println(input);

                    } else {
                       //If not, print "error".
                        System.out.println("error");

                    }

                    break;

            }

            task = scanner.nextLine().split(":\\|:");

        }

        System.out.printf("You have a new text message: %s", input);

    }
}
