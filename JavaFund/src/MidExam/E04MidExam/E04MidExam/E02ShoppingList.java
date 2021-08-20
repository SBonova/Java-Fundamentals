package MidExam.E04MidExam.E04MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine()
                .split("!")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")){
            String[] products = command.split(" ");
            String input = products[0];
            String item = products[1];
            switch (input){
                case "Urgent":
                    if (!shoppingList.contains(item)){
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                    }
                    break;
                case "Correct":
//                    String[] splitted = item.split(" ");
//                    String oldItem = splitted[0];
//                    String newItem = splitted[1];
//                    int index = shoppingList.indexOf(oldItem) + 1;
//                    if (shoppingList.contains(oldItem)){
//                        shoppingList.add(index, newItem);
//                    }
                    String newItem = products[2];
                    if (shoppingList.contains(item)){
                        shoppingList.set(shoppingList.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)){
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
