package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class E06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//прочитаме два масива от конзолата
//        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(e -> Integer.parseInt(e)).toArray();
//
//        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();

//        int maxLength = 0 ;
//        int sum = 0;
//        int sum2 = 0;
//        for (int i = 0; i < firstArr.length; i++) {
//            sum += firstArr[i];
//            if (firstArr[i] != secondArr[i]){
//                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
//                break;
//            }else {
//                System.out.printf("Arrays are identical. Sum: %d", sum);
//            }
//        }

        int[] firstArray = getIntArrayFromString(scanner.nextLine());
        int[] secondArray = getIntArrayFromString(scanner.nextLine());

        String output = IntStream
                .range(0, firstArray.length)
                .filter(index -> firstArray[index] != secondArray[index])
                .mapToObj(index -> String.format(
                        "Arrays are not identical. Found difference at %d index.",
                        index))
                .findFirst()
                .orElse(String.format(
                        "Arrays are identical. Sum: %d",
                        Arrays.stream(firstArray).sum()));

        System.out.println(output);
    }

    private static int[] getIntArrayFromString(String str) {
        return Arrays.stream(str.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
