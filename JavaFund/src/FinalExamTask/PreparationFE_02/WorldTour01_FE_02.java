package FinalExamTask.PreparationFE_02;

import java.util.Scanner;

public class WorldTour01_FE_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read input
        //switch -> commands
        //print end result

        //On the first line you will be given a string containing all of your stops.
        StringBuilder initialDestination = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Travel")){
            String[] commandParts = command.split(":");
            String commandName = commandParts[0];

            switch (commandName){
                case "Add Stop"://:{index}:{string}
                    int insertIndex = Integer.parseInt(commandParts[1]);
                    String  textToInsert = commandParts[2];

                    // insert the given string at that index only if the index is valid
                    if (indexIsValid(insertIndex, initialDestination.toString())){
                        initialDestination.insert(insertIndex, textToInsert);
                        System.out.println(initialDestination);
                    }
                    break;

                case "Remove Stop"://:{start_index}:{end_index}
                    int removeBeginIndex = Integer.parseInt(commandParts[1]);
                    int removeEndIndex = Integer.parseInt(commandParts[2]);

                    // remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
                    if (indexIsValid(removeBeginIndex, initialDestination.toString())
                    && indexIsValid(removeEndIndex, initialDestination.toString())){
                        initialDestination.delete(removeBeginIndex, removeEndIndex + 1);
                    }
                    System.out.println(initialDestination);
                    break;

                case "Switch"://:{old_string}:{new_string}
                    String oldString = commandParts[1];
                    String newString = commandParts[2];

                    //if the old string is in the initial string, replace it with the new one. (all occurrences)
                    String destinationAsString = initialDestination.toString();
                    destinationAsString = destinationAsString.replaceAll(oldString, newString);

                    initialDestination = new StringBuilder(destinationAsString);
                    System.out.println(initialDestination);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", initialDestination);
    }

    public static boolean indexIsValid(int index, String text){
        return index >= 0 && index < text.length();
    }
}
