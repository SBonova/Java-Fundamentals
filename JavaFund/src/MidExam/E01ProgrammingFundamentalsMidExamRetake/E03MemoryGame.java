package MidExam.E01ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<String> sequence = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
//        String userInput = scanner.nextLine();
//        int counter = 0;
//        while(!userInput.equals("end")){
//            counter++;
//            int[] userInputArray = Arrays.stream(userInput.split(" "))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
//
//            int firstIndex = userInputArray[0];
//            int secondIndex = userInputArray[1];
//
//            if(userIsCheating(firstIndex, secondIndex, sequence)){
//                System.out.println("Invalid input! Adding additional elements to the board");
//                //add 2 new cards in the middle of the sequence
//                String penaltyNumber = String.format("-%da", counter);
//                sequence.add(sequence.size()/2, penaltyNumber);
//                sequence.add(sequence.size()/2, penaltyNumber);
//                userInput = scanner.nextLine();
//                continue;
//            }
//
//            String firstNumber = sequence.get(firstIndex);
//            String secondNumber = sequence.get(secondIndex);
//
//            if(firstNumber.equals(secondNumber)){
//                sequence.remove(firstNumber);
//                sequence.remove(secondNumber);
//                System.out.printf("Congrats! You have found matching elements - %s!%n", firstNumber);
//            } else {
//                System.out.println("Try again!");
//            }
//
//            if(sequence.size() == 0){
//                break;
//            }
//            userInput = scanner.nextLine();
//        }
//
//        if(sequence.isEmpty()){
//            System.out.printf("You have won in %d turns!", counter);
//        } else {
//            System.out.println("Sorry you lose :(");
//            System.out.println(String.join(" ", sequence));
//        }
//
//
//    }
//
//    private static boolean userIsCheating(int firstIndex, int secondIndex, List<String> sequence) {
//        if(firstIndex == secondIndex){
//            return true;
//        }
//
//        if(firstIndex < 0 || firstIndex >= sequence.size()){
//            return true;
//        }
//
//        if(secondIndex < 0 || secondIndex >= sequence.size()){
//            return true;
//        }
//
//        return false;
//    }

        List<String> twin = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String userInput = scanner.nextLine();
        int counter = 0;

        while (!userInput.equals("end")) {
            counter++;
            int[] userInputArray = Arrays.stream(userInput.split(" ")).mapToInt(Integer::parseInt).toArray();

            int firstIndex = userInputArray[0];
            int secondIndex = userInputArray[1];

            if (firstIndex == secondIndex) {
                //add 2 new element in the middle
                String addElement = String.format("-%da", counter);
                twin.add(twin.size() / 2, addElement);
                twin.add(twin.size() / 2, addElement);

                System.out.println("Invalid input! Adding additional elements to the board");
            } else if (firstIndex < 0 || firstIndex >= twin.size()) {
                //add 2 new element in the middle
                String addElement = String.format("-%da", counter);
                twin.add(twin.size() / 2, addElement);
                twin.add(twin.size() / 2, addElement);

                System.out.println("Invalid input! Adding additional elements to the board");
            } else if (secondIndex < 0 || secondIndex >= twin.size()) {
                //add 2 new element in the middle
                String addElement = String.format("-%da", counter);
                twin.add(twin.size() / 2, addElement);
                twin.add(twin.size() / 2, addElement);

                System.out.println("Invalid input! Adding additional elements to the board");
            }

            String first = twin.get(firstIndex);
            String second = twin.get(secondIndex);
            if (first.equals(second)) {
                twin.remove(firstIndex);
                twin.remove(secondIndex);
                System.out.printf("Congrats! You have found matching elements - $%s!", first);
            } else {
                System.out.println("Try again!");
            }
            userInput = scanner.nextLine();
        }
        if (twin.size() == 0) {
            System.out.printf("You have won in %d turns!", counter);
            return;
        } else {
            System.out.printf("Sorry you lose :(\n");
            System.out.println(String.join(" ", twin));
        }

    }
}
