package Arrays.Exercise;
import java.util.Arrays;

import java.util.Scanner;

public class E07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първи начин за решаване
        int [] array = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        int biggestCounter = 0;
        int keepFirstIndex = 0;
        int keepSecondIndex = 0;

        int i = 0;

        while(i < array.length - 1 ) {
            int j = i + 1;

            int counter = 1;
            while(j < array.length && array[j] == array[i]){
                counter++;
                j++;
            }
            if(counter > biggestCounter) {
                biggestCounter = counter;
                keepFirstIndex = i;
                keepSecondIndex = j;
            }
            i = j;
        }
        for ( i = keepFirstIndex; i < keepSecondIndex ; i++) {
            System.out.print(array[i] + " ");
        }

     //Втори начин на решаване
        // От конзолата се прочита число и след това се задава като дължина на масива
//        int [] arr = Arrays.stream(scanner.nextLine()
//                .split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        // С for цикъл се прочитат от конзолата елементите на масива
//        for (int i = 0; i < arr.length; i++) {
//         //   arr[i] = Integer.parseInt(scanner.nextLine());
//        }
//        // Създават се три променливи: counter, max и element. Променливата counter се инициализира с 1, а не с 0,
//        // защото, към един вече съществуващ елемент се прибавят еднаквите му, а max ще пази най-дългата поредица от повтарящи се елементи.
//        // Променливата element ще покаже кой точно елемент се повтаря
//        int counter = 1;
//
//        int max = 0;
//
//        int element = 0;
//
//        //Използваме for цикъл, приключващ до дължината на масива – 1,
//        // тъй като индексът на последния елемент е дължината на масива – 1
//        // (защото позициите се броят от 0). Променливата counter се увеличава,
//        // щом срещне два или повече еднакви елемента
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == arr[i + 1]){
//                counter++;
//
//            }else {
//                // В противен случай counter остава 1,
//                // с презумпцията, че има само 1 елемент сам по себе си.
//                counter = 1;
//            }
//            //max запазва най-дългата от всички поредици еднакви елементи.
//            // Когато срещне поредица от еднакви елементи по-голяма от стойността на caunter,
//            // max се инициализира с counter
//
//            if (max < counter){
//                max = counter;
//                element = arr[i];
//            }
//        }

    }
}
