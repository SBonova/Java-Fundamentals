package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Arrays.stream(input)
                .map(Integer::parseInt)
                                        //сравнението е в низходящ ред
                .sorted((left, right) -> right.compareTo(left))
                .limit(3)
                .forEach(е -> System.out.print(е + " "));
    }
}
