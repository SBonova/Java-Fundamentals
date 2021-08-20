package Lists.Exercese;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //list of integers from the console
        List<Integer> numbersInTheArray = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String commandData = command.split(" ")[0];
            int element = Integer.parseInt(command.split(" ")[1]);
            if (commandData.equals("Delete")){
               numbersInTheArray.removeAll(Arrays.asList(element));
            }else if (commandData.equals("Insert")){
                int index = Integer.parseInt(command.split(" ")[2]);
                numbersInTheArray.add(index, element);
            }
            command = scanner.nextLine();
        }
        printList(numbersInTheArray);
    }

    private static void printList(List<Integer> numbersInTheArray) {
        for (int number : numbersInTheArray) {
            System.out.print(number + " ");
        }
    }
}
