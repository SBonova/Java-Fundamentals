package TextProcessing.MoreExercise;

import java.util.Scanner;

public class E06WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] allTickets = input.split("//,s+");

        for (String ticket : allTickets) {
            if (ticket.length() != 20){
                System.out.println("invalid ticket");
            }else {

            }
        }
    }
}
