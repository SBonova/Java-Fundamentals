package FinalExamTask.FER_01;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        String command = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        while (!command.equals("Decode")){
            String[] instructions = command.split("\\|");
            String operations = instructions[0];

            switch (operations){
                case "Move"://{number of letters}
                    int numberOfLetters = Integer.parseInt(instructions[1]);

                    //Moves the first n letters to the back of the string.
                   stringBuilder.append(encryptedMessage, 0, numberOfLetters);
                   encryptedMessage = encryptedMessage.substring(numberOfLetters).concat(stringBuilder.toString());
                   //stringBuilder = ""; т.е го занулява
                   stringBuilder.setLength(0);
                    break;
                case "Insert"://{index} {value}
                    int index = Integer.parseInt(instructions[1]);
                    String value = instructions[2];

                    //Inserts the given value before the given index in the string.
                    stringBuilder.append(encryptedMessage);
                    encryptedMessage = stringBuilder.insert(index,value).toString();
                    stringBuilder.setLength(0);
                    break;
                case "ChangeAll"://{substring} {replacement}
                    String substring = instructions[1];
                    String replacement = instructions[2];

                    //Changes all occurrences of the given substring with the replacement text.
                    if (encryptedMessage.contains(substring)){
                        encryptedMessage = encryptedMessage.replace(substring, replacement);
                    }
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        //After the "Decode" command is received, print this message:
        //"The decrypted message is: {message}"
        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}
