package DataTypesAndVariables.Exercise2;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        String n = scanner.nextLine();
//        int sum = 0;
//
//        for (int i = 0; i < n.length(); i++) {
//            int currNum = (int)n.charAt(i) - 48;
//            sum = sum + currNum;
//        }
//        System.out.println(sum);
//        int number = Integer.parseInt(scanner.nextLine());
//        int sum = 0; // сума на цифрите
//
//        while (number != 0) {
//            int lastDigit = number % 10;// взимаме последната цифра
//            sum += lastDigit;
//            number = number / 10;
//
//        }
//        System.out.println(sum);

//        int[]arr = {3,4,5,6,8};
//        System.out.println(arr.length);
//        System.out.println(arr[0]);
        // obhojdane na masiwa po daljinata
//        for (int index = 0; index < arr.length - 1; index++) {
//            System.out.println(arr[index]);
//        }

        //Exercise: Arrays
        //Train s for cikal
//        int n = Integer.parseInt(scanner.nextLine());//бр. на вагоните
//        int sumPeople = 0;
//        for (int wagon = 1; wagon <=n; wagon++) {
//            // прочитаме хората, които са се качили във вагоните
//            int people = Integer.parseInt(scanner.nextLine());
//            //печатаме броят на хората
//            System.out.print(people + " ");
//            //добавяме бр. към сумата
//            sumPeople += people;
//        }
//        System.out.println();
//        System.out.print(sumPeople);


        //Train s Array

//        int n = Integer.parseInt(scanner.nextLine());//бр. на вагоните
//        int[] people = new int[n];
//
//        for (int i = 0; i <= people.length - 1; i++) {
//            people[i] = Integer.parseInt(scanner.nextLine());
//        }
//        int sumPeople = 0;
//        //трябва да взема всеки елемент от масива -> принтирам -> сумирам
//        for (int countPeople:people) {
//            System.out.println(countPeople);
//            sumPeople += countPeople;
//        }

        //Common Elements
        //1 red-arr
        //2red-arr2
        //първи прочетен ред
//        String firstRow = scanner.nextLine();//Hey hello 2 4
//        String secondRow = scanner.nextLine();//10 hey 4 hello
//
//        String[] array1 = firstRow.split(" ");//["Hey", "hello", "2", "4"]
//        String[] array2 = secondRow.split("");//["10", "hey", "4", "hello"]
//
//
//        for (String word: array2) {
//            for (String word2: array1) {
//                if (word2.equals(word)){
//                    System.out.println(word + " ");
//                }
//            }
//        }

        //Zig-Zag Arrays
        int n = Integer.parseInt(scanner.nextLine());//бр. на редовете
        //ако е четен ред- първото число отива във втория масив; второто във първия
        //акое нечетен ред = първото отива в първият масив, втори във втория

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int row = 0; row < n ; row++) {
            String input = scanner.nextLine();// "12 34" - split(" ")->["12", "34"]
                                           //въща масив и казваме кой елемент искаме на коя позиция е
            int firstNum = Integer.parseInt(input.split(" ")[0]);
            int secondNum = Integer.parseInt(input.split(" ")[1]);
            //проверка дали е четен реда
            if ((row + 1) % 2 == 0) {
                array1[row] = secondNum;
                array2[row] = firstNum;
            }else {
                array1[row] = firstNum;
                array2[row] = secondNum;
            }
        }
        //отпечатваме масив 1
        for (int num :array1) {
            System.out.print(num + " ");
        }
        System.out.println();
        //отпечатваме масив 2
        for (int num : array2) {
            System.out.print(num + " ");
        }
    }

}
