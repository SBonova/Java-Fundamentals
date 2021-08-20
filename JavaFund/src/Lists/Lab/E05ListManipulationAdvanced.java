package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read a list
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }

            String[] input = line.split(" ");
            switch (input[0]) {
                case "Contains":
                    int num = Integer.parseInt(input[1]);
                    if (numbers.contains(num)){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                        break;
                case "Print even":
                    if (input[1].equals("even")) {
                        for (int i = 0; i < numbers.size() - 1; i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.println(numbers.get(i) + " ");
                                System.out.println();
                            }
                        }
                    }
                    break;
                case "Print odd":
                    if (input[1].equals("odd")) {
                        for (int i = 0; i < numbers.size() - 1; i++) {
                            if (numbers.get(i) % 2 == 1) {
                                System.out.println(numbers.get(i) + " ");
                                System.out.println();
                            }
                        }
                    }
                    break;
                case "Get sum":
                    int sum = 0;
                    for (int i = 0; i < numbers.size() - 1; i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int integer = Integer.parseInt(input[2]);
                    if (input[1].equals(">")){
                        for (int i = 0; i < numbers.size() - 1; i++) {
                            if (numbers.get(i) > integer){
                                System.out.println(numbers.get(i) + " ");
                            }else {
                                System.out.println();
                            }
                        }
                    }else if (input[1].equals("<")){
                        for (int i = 0; i < numbers.size() - 1; i++) {
                            if (numbers.get(i) < integer){
                                System.out.println(numbers.get(i) + " ");
                                System.out.println();
                            }
                        }
                    }else if (input[1].equals(">=")){
                        for (int i = 0; i < numbers.size() - 1; i++) {
                            if (numbers.get(i) >= integer){
                                System.out.println(numbers.get(i) + " ");
                                System.out.println();
                            }
                        }
                    }else if (input[1].equals("<=")){
                        for (int i = 0; i < numbers.size() - 1; i++) {
                            if (numbers.get(i) >= integer){
                                System.out.println(numbers.get(i) + " ");
                                System.out.println();
                            }
                        }
                    break;
                    }
            }
        }
    }
}
