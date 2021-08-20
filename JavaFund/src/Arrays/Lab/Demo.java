package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //type arr      = new създаваме нов  int[] с дължина 3
//        int[] numbers = new int[3];
//        numbers[1] = 3;
//        numbers[0] = 2;
//        numbers[2] = numbers[1] + numbers[0];
//        System.out.println();

        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] num = new int[n];
//
//        for (int i = 0; i < num.length; i++) {
//            num[i] = Integer.parseInt(scanner.nextLine());
//        }

        //  literal= nqkakava stojnost

//        int currentDay = Integer.parseInt(scanner.nextLine());
//        String[] days = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        if (currentDay >= 1 && currentDay <= 7){
//        System.out.println(currentDay - 1);
//        }else {
//            System.out.println("Invalid day");
//        }

//        String userInput = "1 2 3 21 25 17";
//        String[]userInputArr = userInput.split(" ");
//        System.out.println(userInput);

//        String[] input = scanner.nextLine().split("");
//
//        for (int i = 0; i < input.length / 2; i++) {
//            String temp = input[i];
//
//        }

        //Day of Week

//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        int currentDay = Integer.parseInt(scanner.nextLine());
//
//        if (currentDay >= 1 && currentDay <= 7) {
//            System.out.println(days[currentDay - 1]);
//        } else {
//            System.out.println("Invalid day!");
//        }

        //Print Numbers in Reverse Order
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] num = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            num [i]  = Integer.parseInt(scanner.nextLine());
//        }
//
//        for (int i = num.length - 1; i >= 0; i--) {
//            System.out.println(num[i] + " ");
//        }

        //Sum Even Numbers

//        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(e -> Integer.parseInt(e)).toArray();
//
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0){
//               sum += numbers[i];
//            }
//        }

        //Reverse an Array of Strings

// на първи ред получаваме входни данни
//        String input = scanner.nextLine();//51 47 32 61 21
//        String [] numbers = input.split(" ");//"51 47 32 61 21".split(" ")->["51", "47", "32" 61 21]
//        int countRotations = Integer.parseInt(scanner.nextLine());//2 - br. на ротацииите
//
//        for (int rotation = 1; rotation <= countRotations; rotation++) {
//            //ротация - 1. взимаме първият елемен;
//            String firstElement = numbers[0];
//            //2. местим всички елементи с 1 наляво (индексът на елемента = индекс - 1);
//            for (int index = 0; index < numbers.length - 1; index++) {
//                numbers[index] = numbers[index + 1];
//            }
//           // 3.на последният индекс ще сложа първият елемент
//            numbers[numbers.length - 1] = firstElement;
//        }
//        for (String num:numbers) {
//            System.out.println(numbers + " ");
//        }
//       // System.out.println(String.join(" ", numbers));


        //zad 6
        //"1 2 30 4" ->split(" ") -> ["1", "2", "30", "4"]-(scanner.nextLine().split(" "))
//        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        for (int index = 0; index < numbers.length; index++) {
//            //всеки път ще си съхранявам елемента който ми се намира на текущият индекс
//            // = вземи ми елемента, който се намира на текущия индекс
//            int currElement = numbers[index];
//            int leftSum = 0;
//            int right = 0;
//            int  rightSum = 0;
//            boolean isFound = false;
//
//            //лявата сума ->0 до моя индекс
//            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
//
//                leftSum += numbers[leftIndex];
//            }
//            //дясна сума -> моя индекс + 1 до последния (numbers.length - 1)
//            for (int rightIndex = 0; rightIndex <= numbers.length - 1; rightIndex++) {
//                rightSum += numbers[rightIndex];
//            }
//            if (leftSum == rightSum) {
//                System.out.println(index);
//                isFound = true;
//            }
//
//            if (isFound){
//                System.out.println("no");
//            }
//        }

        //прочитаме броят вагони
//        int n = Integer.parseInt(scanner.nextLine());
//        //правим ги на масив
//        int[] trains = new int[n];
//        int people = 0;
//
//        for (int i = 0; i < n; i++) {
//            //колко хора са се качили на първата итерация
//             trains[i] = Integer.parseInt(scanner.nextLine());
//            // хората които са се качили във вагона
//            trains[i] += people;
//        }
//
//        for (int i = 0; i < trains.length; i++) {
//            //принтираме колко общо хора са се качили във  вагоните
//            System.out.println(trains[i] + " ");
//        }


//        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();

//        String[] firstArr = scanner.nextLine().split(" ");
//        String[] secondArr = scanner.nextLine().split(" ");
//
//        for (int i = 0; i < secondArr.length; i++) {
//
//            for (int j = 0; j < firstArr.length; j++) {
//                if (secondArr[i].equals(firstArr[i])){
//                    System.out.println(secondArr[i] + " ");
//                }
//            }
//        }

//        //You will be given an integer n.
//        int n = Integer.parseInt(scanner.nextLine());
//        //Write a program which creates 2 arrays
//        int[] firstArr = new int[n];
//        int[] secondArr = new int[n];
//
//        //върти се цикъл до n- броят на редовете
//        for (int i = 0; i < n; i++) {
//            //прочитат се данните от редовете
//            //On the next n lines, you get 2 integers
//            String[] num = scanner.nextLine().split(" ");
//            //
//            if (i % 2 == 0){
//                firstArr[i - 1] = Integer.parseInt(scanner.nextLine[1]);
//                secondArr[i - 1] = Integer.parseInt(scanner.nextLine([0]);
//            }else {
//                firstArr[i - 1] = Integer.parseInt(line[0]);
//                secondArr[i - 1] = Integer.parseInt(line[1]);
//            }
//        }
//        //прочитаме дължината на първият масив
//        for (int j = 0; j < firstArr.length; j++) {
//            System.out.println(firstArr[j] + " ");
//        }
//
//        for (int i = 0; i < secondArr.length; i++) {
//            System.out.println(secondArr[i] + " ");
//        }


//        int[]num = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int countRotation = Integer.parseInt(scanner.nextLine());
//
//        //завъртя се цикъл с броят ротации
//        for (int i = 0; i < countRotation; i++) {
//           //прочита се масива
//           int firstElement = num[0];
//           //първо намираме на коя позиция е елемента
//            // и изместваме елементите от първите позиции на позледна- така местим масива на ляво
//            for (int j = 0; j < num.length - 1; j++) {
//                num[j] = num[j + 1];
//            }
//            //add first element to last position
//            num[num.length - 1] = firstElement;
//        }
//        //print
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i] + " ");
//        }

        //Top Integers

//        int[] input = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        for (int i = 0; i < input.length - 1; i++) {
//            if (input[i] > input[i+1]){
//                System.out.println(input[i]+" ");
//            }
//        }
//        System.out.println(input[input.length - 1]);

//        String[] first = scanner.nextLine().split(" ");
//        String[] second = scanner.nextLine().split(" ");
//
//        for (int i = 0; i < second.length ; i++) {
//            for (int j = 0; j < first.length; j++) {
//                if (second[i].equals(first[j])){
//                    System.out.println(second[i] + " ");
//                }
//            }
//        }

//        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday"};
//
//        int day = scanner.nextInt();
//
//        if (day >= 1 && day <= 7){
//            System.out.println(dayOfWeek[day - 1]);
//        }else {
//            System.out.println("Invalid day!");
//        }

//        //прочитаме броя на числата от конзолата
//        int input = Integer.parseInt(scanner.nextLine());
//        // масив от броя прочетените числа от конзолата
//        int[] numbers = new int[input];
//
//        // фор цикъл да обходим всички числа от входа
//        for (int i = 0; i < input; i++) {
//        // прочитаме всяко едно число от масива
//        int num = Integer.parseInt(scanner.nextLine());
//        //всяко едно число от масива на i позиция да става = на num
//            // t.e zapiswa всяко едно число прочетено от конзолата в масива numbers[] na i-та позиция- 0,1,2
//            numbers[i] = num;
//        }
//        //Print the array in reversed order
//        for (int index = numbers.length - 1; index >= 0 ; index--) {
//            System.out.print(numbers[index] + " ");
//        }

//Read an array from the console
//        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        //sum only the even numbers
//        int sum = 0;
//        //обхождаме всички елементи в масива
//        for (int index = 0; index < numbers.length; index++) {
//            //ако числото е четно го добавяме към сумата
//            if (numbers[index] % 2 == 0){
//                sum += numbers[index];
//            }
//        }
//        System.out.println(sum);

        //read an array of strings
//        String[] input = scanner.nextLine().split(" ");
//
//        //input.length / 2 za da namerim sredata na masiva
//        for (int index = 0; index < input.length / 2; index++) {
//            //презаписваме всеки стринг а става б и т.н
//            String oldInput = input[index];
//            //разменя местата на първият елемент input.length - 1- 0-лева позияна с последния - index
//            input[index] = input[input.length - 1 - index];
////презаписваме размененият стринг, т.е новия
//            input[input.length - 1 - index] = oldInput;
//        }
//        System.out.println(String.join(" ", input));

        //First, we need to read the array.
//        int[] num = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        //We will need two variables – even and odd sum.
//        int evenSum = 0;
//        int oddSum = 0;
//
//        //Iterate through all elements in the array.
//        for (int numbers :num) {
//            //Check the current number – if it is even add it to the even sum, otherwise add it to the odd sum.
//           if (numbers % 2 == 0){
//               evenSum += numbers;
//           }else {
//               oddSum += numbers;
//           }
//        }
//        int diff = evenSum - oddSum;
//        System.out.println(diff);

        //Read two arrays
//        int[] arr1 = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//        int[] arr2 = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int sumArr1 = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            //обхожда всички елементи и ги записва в sumArr1
//       sumArr1 += arr1[i];
//       //проверка дали масивите са равни
//            if (arr1[i] != arr2[i]){
//                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
//                        break;
//            }
//        }
//        System.out.printf("Arrays are identical. Sum: %d", sumArr1);


    }
}

