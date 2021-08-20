package bg.softuni.fundamentals.exerceses;

import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int i = userName.length() - 1; i >= 0; i--) {
            password += userName.charAt(i);
        }

        int counter = 0;
        while (counter < 4) {
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.printf("User %s logged in.", userName);
                return;
            }else {
                System.out.println("Incorrect password. Try again.");
                counter++;
            }
        }
        if (counter == 4) {
            System.out.printf("User %s blocked!", userName);
        }
    }
}
