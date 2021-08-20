package RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dates = scanner.nextLine();

        String regex = "\\b(?<day>\\d{2})(?<separator>[\\.\\/-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matchedDate = pattern.matcher(dates);

        while (matchedDate.find()){
            String day = matchedDate.group("day");
            String month = matchedDate.group("month");
            String year = matchedDate.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
