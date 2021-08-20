package Arrays.Lab;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;

public class EvenАndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First, we need to read the array.
        int[] numbers;
        numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
