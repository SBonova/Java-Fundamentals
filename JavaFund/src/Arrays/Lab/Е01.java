package Arrays.Lab;

import java.util.Scanner;

public class Е01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] numbers = new int[5];


//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scanner.nextInt();
//        }

//ще изведе числата ot zad napred

//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }

//        String[] daysOfWeek = new String[] {"Monday", "Tuesday",
//                "Wednesday", "Thursday",
//                "Friday", "Saturday", "Sunday"};
//
//         int day = new Scanner(System.in).nextInt();
//         if (1 <= day && day <= 7) {
//             System.out.println(daysOfWeek[day - 1]);
//         }else {
//             System.out.println("Invalid day");
//         }

//      размерът на масива
//        int n =scanner.nextInt();
//        //създаваме нов масив със размер n
//        int[]numbers = new int[n];
//        //прочитане на всяко едно число чрез фор цикъл
//        for (int i = 0; i < numbers.length; i++) {
//            //прочита всяко следващо число
//            numbers[i] = Integer.parseInt(scanner.next());
//        }
//        //размяна на позициите в масива последния да дойде на посиция 0 и да стане пръв
//        for (int i = 0; i < numbers.length; i++) {
//            int swapIndex = numbers[numbers.length - 1 - i];
//            int swap = numbers[i];
//            numbers[i] = numbers[swapIndex];
//            numbers[swapIndex] = swap;
//
//        }

        //масив от стрингове
//        String[] words = new String[]{"the", "quick", "brown", "fox"};
//
//        String s = String.join(" ",words);
//        System.out.println(s);

//        int[] numbers = new int [] {1, 2, 13, 42};
//
//        String[] numbersAsString = new String[numbers.length];
//        for (int i = 0; i < numbersAsString.length; i++) {
//            numbersAsString[i] = String.valueOf(numbersAsString);
//        }
//
//        String s = String.join("---->", numbersAsString);
//        System.out.println(s);
        //odd or even
        String line = scanner.nextLine();
        String[] numbersAsString = line.split(" ");

        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        int evenSum = 0;
        int oddSum = 0;
        //forich cikal- когато ни трябва само самото число
        for (int number : numbers) {
            if (number % 2 == 0){
                evenSum += number;
            }else {
                oddSum += number;
            }

        }
        System.out.println(evenSum - oddSum);
    }
}
