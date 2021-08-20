package Arrays.Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First, we need to read the array.

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

      //  We will need a variable for the sum.
        int sum = 0;

        //Iterate through all elements in the array with for loop. If the number is even add it to the sum.

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }

        //Print the total sum
        System.out.println(sum);
    }
}
