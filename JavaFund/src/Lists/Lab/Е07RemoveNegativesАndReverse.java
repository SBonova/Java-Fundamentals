package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Е07RemoveNegativesАndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //remove negative numbers method
        numbers = removeNegativeNumbers(numbers);

        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
            //da gi obarne
            Collections.reverse(numbers);
           // print all numbers joined by space.
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static List<Integer> removeNegativeNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element < 0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }


}
