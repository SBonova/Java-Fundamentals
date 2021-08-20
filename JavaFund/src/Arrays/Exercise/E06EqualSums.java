package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        //когато имаме само един елемент, той няма лява и дясна сума
        if (numbers.length < 1){
            System.out.println(0);
            return;
        }

        boolean isEquals = false;

        for (int i = 0; i < numbers.length; i++) {
             int leftSum = 0;
             int rightSum = 0;


             //i-1 for leftSum;j-- za da stigne do 0-leviqt index
            //i=>current number
            for (int j = i - 1; j >= 0; j--) {
                leftSum += numbers[j];
            }
            //i+1 for right sum; ++ za dostigne do posledniq index
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }

            //проверяваме двете суми дали са равни
            if (leftSum == rightSum){
                isEquals = true;
                System.out.print(i);
                break;
            }
        }

        //ако не са равни
        if (!isEquals){
            System.out.print("no");
        }
    }
}
