package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] input = Arrays.stream(scanner.nextLine().split(" "))
               .mapToInt(Integer::parseInt).toArray();

       int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] + input[j] == num){
                    System.out.println(input[i] + " " + input[j]);
                }
            }
        }
    }
}
