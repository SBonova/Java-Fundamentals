package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // reads a list of integers.
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

    //we make the while loop for the commands and make switch statement for the commands


         //Then until you receive "end"
        while (true){
            String command = scanner.nextLine();

            if (command.equals("end")){
                break;
            }
            String[] tokens = command.split(" ");
           switch (tokens[0]){
               case "Add":
                   int numberToAdd = Integer.parseInt(tokens[1]);
                   numbers.add(numberToAdd);
                   break;
               case "Remove":
                   int numberToRemove = Integer.parseInt(tokens[1]);
                   numbers.remove(Integer.valueOf(numberToRemove));
                   break;
               case "RemoveAt":
                   int indexToRemove = Integer.parseInt(tokens[1]);
                   numbers.remove(indexToRemove);
                   break;
               case "Insert":
                   int numberToInsert = Integer.parseInt(tokens[1]);
                   int indexToInsert = Integer.parseInt(tokens[2]);
                   numbers.add(indexToInsert, numberToInsert);
                   break;
           }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
