package Lists.Exercese;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Е05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочита първият ред 1 2 2 4 2 2 2 9
        List<Integer>numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //прочита вторият ред, като го прави на масив ["4", "2"]
        String[] bombData = scanner.nextLine().split(" ");
       //парсва стринга "4" към числото 4 и го слага на 0-лева позиция
        int bomb = Integer.parseInt(bombData[0]);
        // //прочита елемента на 1-ва позиция-power
        int power = Integer.parseInt(bombData[1]);

        while (numbers.contains(bomb)){
            //бр. елементи наляво от bomb
            int index = numbers.indexOf(bomb);
            //лявата страна = индех - power
            int leftRange = Math.max(0,index - power);

            for (int i = leftRange; i < index; i++) {
                numbers.remove(leftRange);
            }
            index = numbers.indexOf(bomb);
            int rightRange = Math.min(index + power, numbers.size() - 1);

            for (int i = index; i <= rightRange; i++) {
                numbers.remove(index);
            }

            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println(sum);
        }
    }
}
