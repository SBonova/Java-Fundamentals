package MidExam.E01ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class E02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        String[] userInput = scanner.nextLine().split(" ");

        int[] liftCabins = Arrays.stream(userInput).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < liftCabins.length; i++) {
           //Влизане хора от опашката
           int peopleInCabin = liftCabins[i];
           int freeSpace = 4 - peopleInCabin;

           if (peopleInCabin == 4){
               continue;
           }
           if (freeSpace >= peopleInQueue){
               liftCabins[i] = liftCabins[i] + peopleInQueue;
               peopleInQueue = 0;
               break;
           }
           liftCabins[i] = 4;
           peopleInQueue = peopleInQueue -freeSpace;
        }
        if (peopleInQueue == 0){
            System.out.println("The lift has empty spots!");
        }else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
        }
        Arrays.stream(liftCabins).forEach(e -> System.out.print(e + " "));
    }
}
