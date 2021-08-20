package MidExam2MidExamProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class E02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commands = command.split("\\s+");
            String direction = commands[0];

            switch (direction) {
                case "swap":
                    int index1 = Integer.parseInt(commands[1]);
                    int index2 = Integer.parseInt(commands[2]);
                    //проверка за валидност на масива
                    if (index1 >= 0 && index1 < numbers.length && index2 >= 0 && index2 < numbers.length) {
                        //присвояваме стойността на първият елемент за да не се загуби при смяната на стойностите
                        int temp = numbers[index1];
                        //стойноста на първият елемент се присвоява стойността на елемент 2
                        numbers[index1] = numbers[index2];
                        //вторият елемент вече присваоявастойността на първият елемент
                        numbers[index2] = temp;
                    }
                    break;
                case "multiply":
                    index1 = Integer.parseInt(commands[1]);
                    index2 = Integer.parseInt(commands[2]);
                    if (index1 >= 0 && index1 < numbers.length && index2 >= 0 && index2 < numbers.length) {
                        int temp = numbers[index1] * numbers[index2];
                        // стойността се запазва във първият елемент
                        numbers[index1] = temp;
                    }
                    break;
                case "decrease":
                    //“decrease” decreases all elements in the array with 1.
                    //фор цикъл за да обходим елементите от масива
                    for (int i = 0; i < numbers.length; i++) {
                        // и наманяме всеки един елемент с 1
                        int temp = numbers[i] - 1;

                        numbers[i] = temp;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        // принтиране на елементите във масива

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

