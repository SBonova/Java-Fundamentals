package ObjectsAndClasses.Exercise;

import ObjectsAndClasses.Exercise.Article;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();//"{title}, {content}, {author}"
        String[] splitData = articleData.split(",\\s+");//["{title}", "{content}", "{author}"]
        String title = splitData[0];
        String content = splitData[1];
        String author = splitData[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(":\\s+ ")[0];//Edit, ChangeAuthor, Rename
            String commandParameter = command.split(":\\s+ ")[1];//new Content, new author, new rename

            switch (commandName) {
                case "Edit":
                    article.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    article.rename(commandParameter);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
