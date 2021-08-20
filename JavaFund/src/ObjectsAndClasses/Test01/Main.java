package ObjectsAndClasses.Test01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitData = input.split(" ");
        String title = splitData[0];
        String content = splitData[1];
        String author = splitData[2];

        Articles articles = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(":\\s+")[0];
            String commandParameter = command.split(":\\s+")[1];

            switch (commandName) {
                case "Edit":
                    articles.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    articles.rename(commandParameter);
                    break;
            }
        }
        System.out.println(articles.toString());
    }
}
