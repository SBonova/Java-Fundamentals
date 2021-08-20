package Exam10072021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] products = command.split(" - ");
            String input = products[0];
            String item = products[1];
            switch (input) {
                case "Add":
                    if (!shoppingList.contains(item)){
                        shoppingList.add(item);
                    }
                    break;
                case "Remove":
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                    }
                    break;
                case "Bonus phone":
                    String[] split = item.split(":");
                    String oldItem = split[0];
                    String newItem = split[1];

                    int index = shoppingList.indexOf(oldItem) + 1;

                    if (shoppingList.contains(oldItem)){
                        shoppingList.add(index, newItem);
                    }
                    break;
                case "Last":
                    if (shoppingList.contains(item)){
                        index = shoppingList.indexOf(item);
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
