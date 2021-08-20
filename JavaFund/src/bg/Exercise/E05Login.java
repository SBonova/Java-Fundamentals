package bg.Exercise;

import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //username
        //1.намираме паролата -> username na obratno

        String username = scanner.nextLine();
//        //username: "Svetla" -> password return - "altevS"
//        System.out.println(username.charAt(0));
//        System.out.println(username.length() - 1);//последната позиция се намира като length() - 1

//        for (int position = 0; position <= username.length() - 1; position++) {
//
//        }
        String password = "";
        for (int position = username.length() - 1; position >= 0; position--) {
            //Взимам символа на текущата позиция
            char currSymbol = username.charAt(position);
            //добавям към паролата
            password += currSymbol;
        }

        //повторение: въвеждаме парола
        //спираме: въведената парола != password
        String enteredPassword = scanner.nextLine();
        int countFailedAttempts = 0;

        while (!enteredPassword.equals(password)) {

            // проверка дали съм стигнала 4 грешни опита
            if (countFailedAttempts >= 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            //грешна парола
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        // enterPassword == password
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
