package bg.Lab.BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spokenLanguage = scanner.nextLine();

        if (spokenLanguage.equals("England") || spokenLanguage.equals("USA")) {
            System.out.println("English");
        }else if (spokenLanguage.equals("Spain") || spokenLanguage.equals("Argentina")
        || spokenLanguage.equals("Mexico")){
            System.out.println("Spanish");
        }else {
            System.out.println("unknown");
        }

    }
}
