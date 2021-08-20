package AssociativeArrays.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<Double, Integer> numbers = new TreeMap<>();
        double[] nums = Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();
        //8 2 2 8 2
        for (double number : nums) {
            if (!numbers.containsKey(number)) {
                numbers.put(number, 1);
            }else {//put - се използва за добавяне или промяна на елементи
                int occurrence = numbers.get(number);
                occurrence++;
                numbers.put(number, occurrence);
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.#######");

        for (Map.Entry<Double,Integer> entry : numbers.entrySet()) {
            System.out.printf("%s -> %d%n", decimalFormat.format(entry.getKey()),entry.getValue());
        }
    }
}
