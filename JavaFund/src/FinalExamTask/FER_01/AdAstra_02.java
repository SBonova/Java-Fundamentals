package FinalExamTask.FER_01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(#|\\|)(?<product>[A-Za-z ]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d{1,5})\\1");
        Matcher matcherInput = pattern.matcher(input);

        //Calculate the total calories of all food items and then determine how many days you can last with the food you have.
        // Keep in mind that you need 2000kcal a day.
        String separateItem = "";
        int caloriesSeparateInput = 0;
        String date = "";
        int sumCalories = 0;

        Map<String, Integer> itemAndCalories = new LinkedHashMap<>();
        Map<String, String> itemAndDate = new LinkedHashMap<>();

        while (matcherInput.find()) {

            separateItem = matcherInput.group("product");
            caloriesSeparateInput = Integer.parseInt(matcherInput.group("calories"));
            date = matcherInput.group("date");

            itemAndCalories.put(separateItem, caloriesSeparateInput);
            itemAndDate.put(separateItem, date);

            sumCalories += caloriesSeparateInput;
        }

        int limitDays = sumCalories / 2000;
        // You have food to last you for: 9 days!
        // Item: Fish, Best before: 24/12/20, Nutrition: 8500

        if (limitDays > 0) {//First print the amount of days you will be able to last with the food you have
            System.out.printf("You have food to last you for: %d days!%n", limitDays);

            //The output for each food item should look like this:
            for (Map.Entry<String, String> element : itemAndDate.entrySet()) {
                String itemName = element.getKey();
                System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", element.getKey(),element.getValue(),itemAndCalories.get(itemName));
            }
        } else {
            System.out.println("You have food to last you for: 0 days!");
        }
    }
}
