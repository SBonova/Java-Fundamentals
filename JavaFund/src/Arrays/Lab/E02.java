package Arrays.Lab;

import java.util.Locale;
import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждат ни се три числа на конзолата, трябва да ги иведем в обратен ред
        //деклариране на променливи
        //фиксиран брой памет- 4 байта * 3 променливи = 12 байта
        // int a, b, c;

        //прочитаме ги от конлозата
        //ако искаме да създадем масив
        //     int[] numbers = new int[3];
        //първи вариант-позицита на масива
//        numbers[0] = scanner.nextInt();
//        numbers[1] = scanner.nextInt();
//        numbers[2] = scanner.nextInt();
        // за да обходим всички позиции на numbers пускаме един for cical
        //numbers.length - 1 -дава размера на масива
        //    for (int i = 0; i < numbers.length; i++) {
        //казваме numbers на позиция i запиши следващото число
        //        System.out.println(numbers[i]);
        //    }
        //извеждане на данните
        //пускаме още един фор цикъл, който тръгва от i = number.length -1,
        // защото това първото нещо което трябва да принтираме
        // i >= 0, защото върти наобратно и искаме да стигне до 0-ева позиция
        //   for (int i = numbers.length - 1; i >= 0; i--) {

        //     }

//        System.out.println(numbers[2]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[0]);

//   втори вариант
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        System.out.println(c);
//        System.out.println(b);
//        System.out.println(a);

        //масивът е последователност от елементи 0 1 2 3 4 5 от един и същи тип

//        String[] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saterday", "Sunday"};
//        int day = scanner.nextInt();
//
//
//        if (day >= 1 && day <= 7){
//            System.out.println(daysOfWeek[day - 1]);
//        }else {
//            System.out.println("Invalid day");
//        }
//
//        //казват ни, колко на брой са елементите
//        int n = scanner.nextInt();
//
//        //създаваме масива с n броя елементи, защото незнаем колко и какви
//        //ще вкара потребителя
//        int[] arr = new int[n];
//
//        //пускаме един фор цикъл по дължината на масива- прочитаме ги от конзолата
//        for (int i = 0; i < arr.length; i++) {
//            // четем всяко следващо число от конзолата
//            arr[i] = scanner.nextInt();
//        }
//        //пускаме втори фор цикъл за да принтираме всяко едно число от масива
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

        //когато броят на въведените числа ни се подава на един ред,
        //а числата на друг ред, вече не можем да го пишем по горният начин
//        String arrayAsString = scanner.nextLine();//scanner.nextLine

        // по .split se подава по това с което ще го разделяме
//        String[] numberAsStings = arrayAsString.split(" ");

        //в случай в които имаме разделяне с повече от един спейс,
        // правилният начин е arrayAsString.split("\\s+")

//        int[] arr = new int[numberAsStings.length];
//        for (int i = 0; i < arr.length; i++) {
//            // Конвентиране на стринг във инт numberAsStings[i]
//            arr[i] = Integer.parseInt(numberAsStings[i]);//
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

        //da обърнем елементите на масива в обратен ред
        //       int n = scanner.nextInt();//р-рът е първото число - 3 - 3 10 20 30
//        int[] numbers = new int[n];//р-рът на масива 3
        // пускаме един фор цикъл с дължината на масива
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scanner.nextInt();//прочитаме всяко едно число което ни въвеждат от конзолата
//        }

        //самият нъмбер масив да го обърнем на обратно, това
        //става по следния начин като във фор цикъла int i = 0,
        //го замвним с дължината - 1-3оест става int i =numbers.length - 1-i;
        // размяна на позициите-индексите на масива kato stignem до половината, защото ако ги разменим всичките ще
        // получим същият резултат който сме вкарали, т.е няма да има размяна- i < numbers.length / 2;

//        for (int i = 0; i < numbers.length / 2; i++) {
//            int poziciqZaRazmqna = numbers.length - 1 - i;
//            int oldNumbersI = numbers[i];
//            numbers[i] = numbers[poziciqZaRazmqna];
//            numbers [poziciqZaRazmqna] = oldNumbersI;
//        }

//        String text = "The quick brown fox jumps over the lazy dog";
//        String[] wordsCapitalized = text.split(" ");
//        for (int i = 0; i < wordsCapitalized.length; i++) {
//            wordsCapitalized[i] = wordsCapitalized[i].substring(0, 1)
//                    .toUpperCase() + wordsCapitalized[i].substring(1);
//        }
//        String s = String.join(" ", wordsCapitalized);
//        System.out.println(s);

        //форич циклите са съкратен запис на фор циклите за печатане на масиви на конзолата
        // пише се типа int за всяко едно число, което се намира в number : който се намира в numbers и направи примерно ми ги изпечатай на конзолата
        // по този начин не можем да прескачаме елементи и да извеждаме елементи в обратен ред

//          for (int number : numbers) {
//              System.out.println(number);
//        }


//        String line = scanner.nextLine();
//        //всеки един елемент е разделен по спейсове
//        String[] numberAsString = line.split(" ");
//
//        //всеки един елемент е превърнат в число с този цикъл
//        int[] numbers = new int[numberAsString.length];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(numberAsString[i]);
//        }
//
//        int evenSum = 0;
//        int oddSum = 0;
//        for (int number : numbers) {
//            if (number % 2 == 0){
//                evenSum += number;
//            }else {
//                oddSum += number;
//            }
//        }
//
//        System.out.println(evenSum - oddSum);

        String firstArrayString = scanner.nextLine();
        String[] firstNumbersStrings = firstArrayString.split("");
        //нов масив който броят му елементи е броят на въведените елементи
        int[] firstArray = new int[firstNumbersStrings.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstNumbersStrings[i]);
            firstArray[i] = Integer.parseInt(firstNumbersStrings[i]);
        }

        String secondArrayString = scanner.nextLine();
        String[] secondNumbersStrings = secondArrayString.split("");
        //нов масив който броят му елементи е броят на въведените елементи
        int[] secondArray = new int[secondNumbersStrings.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondNumbersStrings[i]);
            secondArray[i] = Integer.parseInt(secondNumbersStrings[i]);
        }

        boolean areEqual = true;
        int differentAtIndex = -1;
        if (firstArray.length == secondArray.length){
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    areEqual = false;
                    differentAtIndex = i;
                    break;
                }
            }
        }else {
            areEqual = false;
        }

        if (areEqual){
            int sum = 0;
            for (int number : firstArray)
            {
                sum += number;
            }
            System.out.printf("Array are indentical", sum);
        }else {
            System.out.println("Array are not indentical" + differentAtIndex + "index");
        }
    }
}
