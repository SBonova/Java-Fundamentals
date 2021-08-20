package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //first way
//        String[] line = scanner.nextLine().split(" ");
//        //презаписване на стринг в интиджър
//        int[] numbers = new int[line.length];
//
//        for (int i = 0; i < line.length; i++) {
//            numbers[i] = Integer.parseInt(line[i]);
//        }
//        System.out.println();

        int[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < number.length; i++) {
            boolean isTopIntiger = true;
            //презаписваме първото число
            int currentNumber = number[i];
            //с фор цикъла минаваме и през следващите числа
            for (int j = i+1; j < number.length; j++) {

                    if (currentNumber <= number[j]){
                        isTopIntiger = false;
                    }
            }
            if (isTopIntiger){
                System.out.print(currentNumber + " ");
            }

        }

    }
}
