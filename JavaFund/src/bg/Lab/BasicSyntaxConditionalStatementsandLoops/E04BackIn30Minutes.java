package bg.Lab.BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        // hour=(hour * 60) + minutes + zakasnenieto-Print on the console the time after 30 minutes.
        int totalTimeInMinutes = (hour * 60) + minutes + 30;


        hour = totalTimeInMinutes / 60;
        minutes = totalTimeInMinutes % 60;

        if (hour > 23) {
            hour = 0;
        }else if (minutes > 59){
            minutes = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
