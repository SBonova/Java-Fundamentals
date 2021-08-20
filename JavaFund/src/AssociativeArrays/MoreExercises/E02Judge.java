package AssociativeArrays.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will receive several input lines in the following format:
        //{username} -> {contest} -> {points}
        TreeMap<String, LinkedHashMap<String, Integer>>judgeSystem = new TreeMap<>();

        //You should end your program when you receive the command "no more time".
        String input = scanner.nextLine();

        while (!input.equals("no more time")){
            //The constestName and username are strings, the given points will be an integer number.
            String[] tokens = input.split("->");
            String constestName = tokens[0];
            String userName = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            //You should check if such contest already exists, and if not, add it,
            // otherwise check if the current user is participating in the contest,
            // if he is participating take the higher score, otherwise just add it.
            if (!judgeSystem.containsKey(constestName)){
               // judgeSystem.put(constestName, new Map<constestName<String, Integer>>());
            }
        }


    }
}
