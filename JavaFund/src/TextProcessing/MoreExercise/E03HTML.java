package TextProcessing.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.printf("<h1>%n  %s%n</h1>%n",title);
        System.out.printf("<article>%n  %s%n</article>%n",content);

        String command = scanner.nextLine();

        while (!command.equals("end of comments")){
            String currentCommand = command;

            if (currentCommand.equals(currentCommand)){
                System.out.printf("<div>%n  %s%n</div>%n", currentCommand);
            }
            command = scanner.nextLine();
        }
    }
}
