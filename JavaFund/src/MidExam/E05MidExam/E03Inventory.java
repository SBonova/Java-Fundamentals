package MidExam.E05MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>journal = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

         while (!command.equals("Craft!")){
             String[] token = command.split(" - ");
             String input = token[0];
             String item = token[1];
             switch (input) {
                 case "Collect":
                    if (!journal.contains(item)){
                        journal.add(item);
                    }
                     break;
                 case "Drop":
                     if (journal.contains(item)){
                         journal.remove(item);
                     }
                     break;
                 case "Combine Items":
                     String[] splitted = item.split(":");
                     String oldItem = splitted[0];
                     String newItem = splitted[1];
                     int index = journal.indexOf(oldItem) + 1;
                     if (journal.contains(oldItem)){
                         journal.add(index, newItem);
                     }
                     break;
                 case "Renew":
                    if (journal.contains(item)){
                        index = journal.indexOf(item);
                        journal.remove(item);
                        journal.add(item);
                    }
                     break;
             }
                     command = scanner.nextLine();
         }
        System.out.println(String.join(", ", journal));
    }
}
