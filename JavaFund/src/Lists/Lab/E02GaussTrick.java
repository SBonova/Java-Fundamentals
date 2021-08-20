package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class E02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        //10 11 12 13 14 15
        // 0  1  2  3  4  5
        //намираме средата на масива
        int halfSize = numbers.size() / 2;

        //обхождаме масива
        for (int i = 0; i < halfSize; i++) {
            //сумираме първият елемент на позиция 0 го събираме с последният елемент
            // и така продължаваме втория + предпоследния и така докато остане само един елемент в масива
            //него си го принтираме
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
            //запазва сумите в масива
            numbers.set(i, sum);
            //изтрива последния елемент
            numbers.remove(numbers.size() - 1);
        }

        for (Integer num:numbers) {
            System.out.print(num + " ");
        }
    }
}
