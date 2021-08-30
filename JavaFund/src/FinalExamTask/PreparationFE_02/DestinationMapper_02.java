package FinalExamTask.PreparationFE_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ("(?<separator>[\\/=])(?<destination>[A-Z][A-Za-z]{2,})\\1");

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();

        while (matcher.find()){
           destinations.add(matcher.group("destination"));
        }

        for (int i = 0; i < destinations.size(); i++) {

        }
        int travelPoints = destinations.stream().mapToInt(destination -> destination.length()).sum();

        String resultText = String.join(", ", destinations);

        System.out.printf("Destinations: %s%n", resultText);
        System.out.printf("Travel Points: %d",travelPoints);
    }
}
