package RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String text = "Pesho Gosho Toshko Sashko";
//        String pattern = "[A-Z][a-z]+";
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(text);
//
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

        String listOfNames = scanner.nextLine();

        String regex = "(?<firstName>\\b[A-Z][a-z]+) (?<secondName>[A-Z][a-z]+\\b)";
        //шаблон
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(listOfNames);

        //докато матчъра намира матчери
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
