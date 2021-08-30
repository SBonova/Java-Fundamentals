package FinalExamTask.PFFE_04;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");
            //["TakeOdd"]
            //["Cut", "{index}", "{length}"]
            //["Substitute", "{substring}", "{substitute}"]
            String commandName = tokens[0];

            switch (commandName) {
                case "TakeOdd":
                    //Takes only the characters at odd indices and concatenates them
                    // together to obtain the new raw password and then prints it.
                    //т.е взимаме нечетните индекси -> нова парола -> после казваме че старата парола = нова
                    password = takeOdd(password);
                    System.out.println(password);
                    break;
                case "Cut":
                    //Gets the substring with the given length starting from the given index from the password
                    // and removes its first occurrence of it, then prints the password on the console.
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);

                    String substringForRemove = password.substring(index, index + length);
                    password = password.replaceFirst(substringForRemove, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    //If the raw password contains the given substring, replaces all of its
                    //occurrences with the substitute text given and prints the result.
                    //If it doesn’t, prints "Nothing to replace!"
                    // substring текста който искаме да заменим
                    String substring = tokens[1];
                    //текста който замества
                    String subsitute = tokens[2];
                    //паролата съдържа текст
                    if (password.contains(substring)) {
                        password = password.replace(substring, subsitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }

    private static String takeOdd(String password) {//взима старата парола
        //съхранение на новата парола
        StringBuilder newPassword = new StringBuilder();

        for (int index = 1; index < password.length() - 1; index += 2) {
            char currentSymbol = password.charAt(index);
            newPassword.append(currentSymbol);
        }
        return newPassword.toString();//връща новата парола
    }
}
//substring-означава че искаме да вземем някакъв подстринг от нашия стринг
//String text = "Test string to demo substring";
//        System.out.println(text.substring(0, 4));
//Когато имаме да заменяме някакъв стринг може да използваме
//String password = "11111Test"
//password = password.replaceAll("1", "d");
//когато искаме да заменим число
//int number = 1;
//password = password.replaceAll(number + "", "d");
