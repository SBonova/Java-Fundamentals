package FinalExamTask.ProgrammingFundamentalsFinalExamRetake_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mirrorwords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<word>[A-Za-z]{3,})\\1\\1(?<mirrorWord>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(text);

        List<String> mirrorPairs = new ArrayList<>();

        int worsPairsCount = 0;

        while (matcher.find()){
            worsPairsCount ++;

            String firstWord = matcher.group("word");
            String secondWord = new  StringBuilder(matcher.group("mirrorWord")).reverse().toString();

            if (firstWord.equals(secondWord)){
                mirrorPairs.add(firstWord + " <=> " + matcher.group("mirrorWord"));
            }
        }
        //If you don`t find any valid pairs print: "No word pairs found!"
        if (worsPairsCount == 0){
            System.out.println("No word pairs found!");
        }else {
            //If you find valid pairs print their count: "{valid pairs count} word pairs found!"
            System.out.printf("%d word pairs found!", worsPairsCount);
        }

        //If there are no mirror words print: "No mirror words!"
        if (mirrorPairs.isEmpty()){
            System.out.println("No mirror words!");
        }else {
            //If there are mirror words print:
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", mirrorPairs));
        }

    }
}
