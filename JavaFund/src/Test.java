import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Integer Operations
//        int FirstNumber = Integer.parseInt(scanner.nextLine());
//        int SecondNumber = Integer.parseInt(scanner.nextLine());
//        int ThirdNumber = Integer.parseInt(scanner.nextLine());
//        int FourthNumber = Integer.parseInt(scanner.nextLine());
//
//        int result = (((FirstNumber + SecondNumber) / ThirdNumber) * FourthNumber);
//
//        System.out.println(result);

        //Sum Digits
//        int n = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//
//       while (n !=0){
//           int curr = n % 10;
//           sum += curr;
//           n = n /10;
//       }
//        System.out.println(sum);

        //Elevator
//        int people = Integer.parseInt(scanner.nextLine());
//        int capacity = Integer.parseInt(scanner.nextLine());
//
//        int numOfCourses = people / capacity;
//        if (people <= capacity){
//            System.out.println("1");
//        }else if (people % capacity == 0){
//            System.out.println(numOfCourses);
//        }else {
//            numOfCourses += 1;
//            System.out.println(numOfCourses);
//        }

        //Sum of Chars
//        byte n = Byte.parseByte(scanner.nextLine());
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            char alphabet = scanner.nextLine().charAt(0);
//            sum += alphabet;
//        }
//        System.out.printf("The sum equals: %s", sum);

        //Print Part of the ASCII Table
//        int first = Integer.parseInt(scanner.nextLine());
//        int second = Integer.parseInt(scanner.nextLine());
//
//        for (int i = first; i <= second; i++) {
//            System.out.print((char)i + " ");
//        }

        //Triples of Latin Letters
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (char i = 'a'; i < 'a' + n; i++) {
//            for (char j = 'a'; j < 'a' + n; j++) {
//                for (char k = 'a'; k < 'a' + n; k++) {
//                    System.out.printf("%c%c%c%n",i, j, k);
//                }
//            }
//        }

        //Water Overflow
//        short n = scanner.nextShort();
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            int quantities = scanner.nextShort();
//            if (sum + quantities > 255){
//                System.out.printf("Insufficient capacity! %n%d",sum);
//            }else {
//                sum += quantities;
//            }
//        }
//        System.out.println(sum);

        //Beer Kegs
//        String model = "";
//        double maxVolume = Double.MIN_VALUE;
//        int counterKeg = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 1; i <= counterKeg; i++) {
//            String modelKeg = scanner.nextLine();
//            double radius = Double.parseDouble(scanner.nextLine());
//            int height = Integer.parseInt(scanner.nextLine());
//
//            double volume = Math.PI * radius * height;
//
//            // проверка дали обема е макс
//            if (volume >= maxVolume){
//                maxVolume = volume;
//                model = modelKeg;
//            }
//        }
//        System.out.println(model);

        //Spice Must Flow
//        double totalAmount = 0;
//        int days = 0;
//        int num = Integer.parseInt(scanner.nextLine());
//
//        while (num > 0){
//            if (num < 100){
//                if (num < 26){
//                    break;
//                }
//               totalAmount -= 26;
//                break;
//            }
//            totalAmount += num - 26;
//            num -= 10;
//            days++;
//
//          //  num = Integer.parseInt(scanner.nextLine());
//        }
//        System.out.println(days);
//        System.out.println(totalAmount);


//Arrays
        //създаване на масив
//        int []numbers = new int[3];System.out.println();
//        //вземане на елемент от масива
//        numbers[1] = 3;
//        numbers[0] = 2;
//        numbers[2] = numbers[1] + numbers[0];
//        //принтиране на елемент
//        System.out.println(numbers[2]);

        //когато се прочита от конзолата
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] numbers = new int[n];
//
////обхождаме масива по цялата му дължина
//        for (int i = 0; i < numbers.length; i++) {
//            //прочитане на всеки следващ елемент
//            numbers[i] = Integer.parseInt(scanner.nextLine());
//        }
        //zad 1
//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        int currentDay = Integer.parseInt(scanner.nextLine());
//
//        if (currentDay >= 1 && currentDay <= 7){
//            //ако потребитя въведе, че иска да види 4 ден- четвъртък
//            //казваме        System.out.println(days[currentDay - 1]);
//            System.out.println(days[currentDay - 1]);
//        }else {
//            System.out.println("Invalid day");
//        }

        //вход от потребителя
//        String userInput = scanner.nextLine();
//        //правим ги на масив и ги разделяме ч/з split
//        String[] userInputArray = userInput.split(" ");//["1", "2", "3"...]
//        //превръщане от стринг към инт
//        int[] numbersArray = new int[userInputArray.length];
//
//        //обхождаме стриг масива със фор цикъл и
//        //вътре в цикъла всяко прочетен стринг го парсваме към инт
//        for (int i = 0; i < userInputArray.length; i++) {
//            numbersArray[i] = Integer.parseInt(userInputArray[i]);
//        }

        //прочитаме число от потребителя-конзолата
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] numbers = new int[n];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(scanner.nextLine());
//        }
//
//        for (int i = numbers.length - 1; i >= 0 ; i--) {
//            System.out.println(numbers[i] + " ");
//        }

        //принтиране на стрингове
//        String names = "Gosho Pesho Toshko";
//        //razdelqne s split
//        String[] namesArray = names.split(" ");
//        String backToString= String.join(" ", names);

//        String[] input = scanner.nextLine().split(" ");
//        for (int i = 0; i < input.length / 2; i++) {
//            String temp = input[i];
        //разменяне на стойностите в индексите
        //{"a" "b" "c" "d" "e" "f"
        //  0   1   2   3   4   5
        //0 -> 5
        //1 -> 4
        //2 -> 3
        //i -> input.length - 1 - i
        //0 -> 6 - 1 - 0 = 5
        //1 ->6 - 1 - 1 = 6
//            input[i] = input[input.length - i];
//            input[input.length - 1 - i] = temp;
//        }
//        System.out.println(String.join(" ", input));

        //  int[] collection = {1, 2, 3}
        //принтиране на масив чрез foreach
        //  искаме да мине през всеки един елемент от masiva и ще приеме неговата стойност еднин след друг
        //  : масив
//        for (int item : collection) {
//            System.out.println(item);
//        }

        //втори начин за принтиране
//        for (int i = 0; i < collection.length; i++) {
//            System.out.println(collection[i]);
//        }

        //прочитане на масив от конзолата-1-ви вариянт
//        String[] input = scanner.nextLine().split(" ");
        //превръщане на масив от стрингове в масив от интове
//        int[] num = new int[input.length];
//        for (int i = 0; i < input.length; i++) {
        //           num[i] = Integer.parseInt(input[i]);
        //     }

        //втори вариянт за прочитане на масив
//        int[] num = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int evenSum = 0;
//        int oddSum = 0;
//
//        for (int number : num) {
//          if (number % 2 == 0){
//              evenSum += number;
//          }else {
//              oddSum += number;
//          }
//        }
//        System.out.println(evenSum - oddSum);

//        int[] fistArray = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int sum = 0;
//        boolean areIndentical = true;
//
//        for (int i = 0; i < secondArray.length; i++) {
//            sum += secondArray[i];
//            if (fistArray[i] != secondArray[i]){
//                System.out.printf("Arrays are not identical. Found difference at %d index", i);
//                areIndentical = false;
//            }
//            if (areIndentical) {
//                System.out.printf("Arrays are identical. Sum: %d", sum);
//            }
        //}
        //zad 1
//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        int input = Integer.parseInt(scanner.nextLine());
//
//            if (input >= 1 && input <= 7){
//                System.out.println(days[input - 1]);
//            }else {
//                System.out.println("Invalid day!");
//            }

        //zad 2
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] numbers = new int[n];
//
//        for (int i = 0; i < numbers.length; i++) {
//          int  number = Integer.parseInt(scanner.nextLine());
//            numbers[i] = number;
//        }
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }

        // zad 3
//        int[] num = Arrays.stream(scanner.nextLine().split(" "))
//           .mapToInt(Integer::parseInt).toArray();
//
//        int sum = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0) {
//                sum += num[i];
//            }
//        }
//        System.out.println(sum);

        //zad 4
//        String[] array = scanner.nextLine().split(" ");
//
//        for (int i = 0; i < array.length / 2; i++) {
//            String temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//        System.out.println(String.join(" ", array));

        //zad 5
//        int[] num = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int evenSum = 0;
//        int oddSum = 0;
//
//            for (int number : num) {
//                if (number % 2==0){
//                    evenSum += number;
//                }else {
//                    oddSum += number;
//                }
//            }
//
//        System.out.println(evenSum - oddSum);

        //zad 6

//        int[] first = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        int[] second = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        boolean isIden = true;
//        int sum = 0;
//        for (int i = 0; i < second.length; i++) {
//            sum += second[i];
//            if (first[i] != second [i]){
//                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
//                isIden = false;
//            }
//
//        if (isIden) {
//            System.out.printf("Arrays are identical", sum);
//        }
//        }

        //Exersise

//        int[] array = {3, 4, 5, 6, 8};
//        System.out.println(array.length);//5
//        //от първият го последният индеь вкл. Tozi zapis e syshiq index < array.length
//        for (int index = 0; index <= array.length - 1; index++) {
//            System.out.println(array[index]);
//        }

//        int n = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//        for (int wagon = 0; wagon < n; wagon++) {
//            //прочитаме броят хора които се качват
//            int people = Integer.parseInt(scanner.nextLine());
//            //печатаме броя хора
//            System.out.print(people + " ");
//            //сумираме броят на хората
//            sum += people;
//        }
//        System.out.println();
//        System.out.println(sum);

//        int n = Integer.parseInt(scanner.nextLine());//брой на вагоните
//        int[] peopleInWagons = new int[n];// "13", "24", "8"
//
//        for (int index = 0; index < peopleInWagons.length; index++) {
//            //за да прочетем всеки следващ ред казваме
//            //дай ми масива peopleInWagons и с/у всеки едининдекс искам да стои числов въведено от конзолата
//            //парснато към инт
//            peopleInWagons[index] = Integer.parseInt(scanner.nextLine());
//        }
//        //всеки елемент от масива ->принтирам -> сумирам
//        int sum = 0;
//        for (int people:peopleInWagons) {
//            System.out.println(people + " ");
//            sum += people;
//        }
//        System.out.println();
//        System.out.println(sum);

        //zad 2
//        String firstRow = scanner.nextLine();//"Hey hello 2 4"
//        String secondRow = scanner.nextLine();//"10 hey 4 hello"
//
//        String[] array1 = firstRow.split(" ");
//        String[] array2 = secondRow.split(" ");
//            //за всеки един елемент : от масив array2
//        for (String secondWord : array2) {
//            for (String firstWord : array1) {
//                if (secondWord.equals(firstWord)){
//                    System.out.print(firstWord + " ");
//                }
//            }
//        }

        //зад 3
//        int n = Integer.parseInt(scanner.nextLine());//съхраняваме броят на редовете
////ако имаме четен ред -> първо число(втори масив); второто число(първи масив)
//        //нечетен ред -> първото число(първи масив); второто число(втори масив)
//        int[] array1 = new int[n];
//        int[] array2 = new int[n];
//        for (int i = 0; i < n; i++) {
//            // за всеки един ред искам да прочета някакви входни данни
//            String input = scanner.nextLine();//"1 5"
//            int firstNumber = Integer.parseInt(input.split(" ")[0]);// "1"
//            int secondNumber = Integer.parseInt(input.split(" ")[1]);// "5"
//
//            //взависимост от това кой ред ни е трябва да направим проверка дали е четен реда
//            if ((i + 1) % 2 == 0){
//              array1[i] = secondNumber;
//              array2[i] = firstNumber;
//            }else {
//               array1[i] = firstNumber;
//               array2[i] = secondNumber;
//            }
//        }
//
//        for (int num : array1) {
//            System.out.println(num + " ");
//        }
//
//        for (int num : array2) {
//            System.out.println(num + " ");
//        }

        //SoftUni Reception
//        int employee1 = Integer.parseInt(scanner.nextLine());
//        int employee2 = Integer.parseInt(scanner.nextLine());
//        int employee3 = Integer.parseInt(scanner.nextLine());
//        int studentsCount = Integer.parseInt(scanner.nextLine());
//        int counter = 0;
//
//        int answerStudentsPerHour = employee1 + employee2 + employee3;
//       while (studentsCount > 0){
//            studentsCount -= answerStudentsPerHour;
//            counter++;
//            if (counter % 4 == 0 && counter != 0) {
//                counter++;
//            }
//        }
//        System.out.printf("Time needed: %dh.", counter);

        //Array Modifier
//        List<Integer> array= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
//
//        String command = scanner.nextLine();
//        while (!command.equals("end")){
//            String[] token = command.split(" ");
//            String word = token[0];
//            switch (word){
//                case "swap":
//                    int index1 = Integer.parseInt(token[1]);
//                    int index2 = Integer.parseInt(token[2]);
//                    Collections.swap(array, index1, index2 );
//                    break;
//                case "multiply":
//                    int multiplyIndex1 = Integer.parseInt(token[1]);
//                    int multiplyIndex2 = Integer.parseInt(token[2]);
//                    array.set(multiplyIndex1,array.get(multiplyIndex1)*array.get(multiplyIndex2));
//                    break;
//                case "decrease":
//                    IntStream.range(0, array.size()).forEach(i -> array.set(i,array.get(i)-1));
//                    break;
//            }
//            command = scanner.nextLine();
//        }
//        System.out.print(Arrays.toString(new List[]{array}).replaceAll("[\\[\\]]", ""));

        //Numbers
//        List<Integer> array= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
//
//        List<Integer>greaterAverage = new ArrayList<>();
//
//       //намираме средната стойност на листа
//        double sum = 0;
//        for (Integer num : array) {
//            sum += num;
//        }
//
//        double average = sum / array.size();
//
//        for (int i = 0; i < array.size(); i++) {
//            if (array.size() == 1){
//                System.out.println("No");
//            }else  if (average < array.get(i)){
//              greaterAverage.add(array.get(i));
//            }
//        }
//        Collections.sort(greaterAverage);
//        Collections.reverse(greaterAverage);
//
//        int counter = 0;
//        for (int num : greaterAverage) {
//            System.out.print(num + " ");
//            counter++;
//            if (counter == 5){
//                break;
//            }
//        }

        //National Court
//        int employee1 = Integer.parseInt(scanner.nextLine());
////        int employee2 = Integer.parseInt(scanner.nextLine());
////        int employee3 = Integer.parseInt(scanner.nextLine());
////        int peopleCount = Integer.parseInt(scanner.nextLine());
////        int hourHeeded = 0;
////
////        int customerServicePerHour = employee1 + employee2 + employee3;
////
////        while (peopleCount > 0){
////            peopleCount -= customerServicePerHour;
////            hourHeeded++;
////
////            if (hourHeeded % 4 == 0 && hourHeeded != 0){
////                hourHeeded++;
////            }
////        }
////
////        System.out.printf("Time needed: %dh.", hourHeeded);


        //Shopping List
//        List<String> shoppingList = Arrays.stream(scanner.nextLine()
//                .split("!")).collect(Collectors.toList());
//
//        String command = scanner.nextLine();
//
//        while (!command.equals("Go Shopping!")) {
//            String[] products = command.split(" ");
//            String input = products[0];
//            String item = products[1];
//            switch (input) {
//                case "Urgent":
//                    if (!shoppingList.contains(item)) {
//                        shoppingList.add(0, item);
//                    }
//                        break;
//                case "Unnecessary":
//                    if (shoppingList.contains(item)){
//                        shoppingList.remove(item);
//                    }
//                    break;
//                case "Correct":
//                    String newItem = products[2];
//                    if (shoppingList.contains(item)){
//                        shoppingList.set(shoppingList.indexOf(item),newItem);
//                    }
//                    break;
//                case "Rearrange":
//                    if (shoppingList.contains(item)){
//                        shoppingList.remove(item);
//                        shoppingList.add(item);
//                    }
//                    break;
//            }
//            command = scanner.nextLine();
//        }
//
//        System.out.println(String.join("," , shoppingList));

        //Inventory
//        List<String>journalList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
//        String command = scanner.nextLine();
//
//        while (!command.equals("Craft!")){
//          String[] commands = command.split(" - ");
//          String item = commands[0];
//          String item1 = commands[1];
//          switch (item){
//              case "Collect":
//                  if (!journalList.contains(item1)){
//                      journalList.add(item1);
//                  }
//                  break;
//              case "Drop":
//                  if (journalList.contains(item1)){
//                      journalList.remove(item1);
//                  }
//                  break;
//              case "Combine Items":
//                  //{oldItem}:{newItem}
//                  String[] split = item1.split(":");
//                  String oldItem = split[0];
//                  String newItem = split[1];
//                  //+1, защото сплитваме от първият индекс
//                  int index = journalList.indexOf(oldItem) + 1;
//                  //check if the old item exists,
//                  if (journalList.contains(oldItem)){
//                      //add the new item after the old one.
//                      journalList.remove(oldItem);
//                      journalList.add(index,newItem);
//                  }
//                  break;
//              case "Renew":
//                  if (journalList.contains(item1)){
//                  // int index1 = journalList.indexOf(item1);
//                  journalList.remove(item1);
//                  journalList.add(item1);
//                  }
//                  break;
//          }
//            command = scanner.nextLine();
//        }
//        System.out.println(String.join(", ", journalList));


//        int[] cupidon = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
//
//        String commandJump = scanner.nextLine();
//        int house = 0;
//
//        while (!commandJump.equals("Love!")) {
//            String[] certainNumberOfHearts = commandJump.split(" ");
//            int jumpLength = Integer.parseInt(certainNumberOfHearts[1]);
//
//            house += jumpLength;
//
//            if (house > cupidon.length ){
//                house=0;
//            }
//            if (cupidon[house] != 0){
//                cupidon[house] -= 2;
//                if (cupidon[house] == 0){
//                    System.out.printf("Place %d has Valentine's day.", house);
//                }
//            }else {
//                System.out.printf("Place %d already had Valentine's day.", house);
//            }
//            commandJump = scanner.nextLine();
//        }
//        //At the end print Cupid's last position
//        System.out.printf("Cupid's last position was %d.", house);
//        //whether his mission was successful or not:
//        boolean isSuccess = true;
//        //If each house has had a Valentine's day, print:
//        for (int num: cupidon) {
//            if (num != 0){
//                isSuccess = false;
//                break;
//            }
//        }
//        int counter = 0;
//        for (int num : cupidon) {
//            if (num != 0){
//                counter++;
//            }
//        }
//        if (isSuccess){
//            System.out.println("Mission was successful.");
//        }else {
//            System.out.printf("Cupid has failed %d places.", counter);
//        }


        //1. Bonus Scoring System

//        int studentCount = Integer.parseInt(scanner.nextLine());
//        int lecturesCount = Integer.parseInt(scanner.nextLine());
//        int courseBonus = Integer.parseInt(scanner.nextLine());
//
//        double studentWithMaxBonus = Double.MIN_VALUE;
//        int maxAtt = Integer.MIN_VALUE;
//
//        if (studentCount == 0 || lecturesCount == 0) {
//            System.out.println("Max Bonus: 0.");
//            System.out.println("The student has attended 0 lectures.");
//            return;
//        }
//        for (int i = 0; i < studentCount; i++) {
//            int attendance = Integer.parseInt(scanner.nextLine());
//            double temp = 1.0 * attendance / lecturesCount * (5 + courseBonus);
//
//            if (temp > studentWithMaxBonus) {
//                studentWithMaxBonus = temp;
//                maxAtt = attendance;
//            }
//           System.out.println(temp);
//            System.out.println(attendance);
//        }
        //   System.out.printf("Max Bonus: %.2f", studentWithMaxBonus);
        //  System.out.printf("The student has attended %d lectures.",maxAtt);

        // Mu Online
//        String[] dungeonsRooms = scanner.nextLine().split("\\|");
//        int health = 100;
//        int bitcoins = 0;
//        int bestRoom = 0;
//        boolean isALife = true;
//
//        for (int i = 0; i < dungeonsRooms.length; i++) {
//            String[] token = dungeonsRooms[i].split("\\s+");
//            String command = token[0];
//            int number = Integer.parseInt(token[1]);
//
//            bestRoom++;
//
//            if (command.equalsIgnoreCase("potion")) {
//                int currentHealth = health;
//                //You are healed with the number in the second part
//                health += number;
//                // But your health cannot exceed your initial health (100).
//                if (health > 100) {
//                    health = 100;
//                    int amount = currentHealth - 100;
//                    System.out.printf("You healed for %d hp.", amount);
//                } else {
//                    System.out.printf("You healed for %d hp.", number);
//                }
//                System.out.printf("Current health: %d hp.", currentHealth);
//            } else if (command.equalsIgnoreCase("chest")) {
//                //You've found some bitcoins, the number in the second part.
//                bitcoins += number;
//                //  System.out.printf("You healed for %d hp.", health);
//                System.out.printf("You found %d bitcoins.", number);
//                if (health <= 0) {
//                    health -= number;
//                    System.out.printf("You slayed %s.", command);
//                } else {
//                    System.out.printf("You died! Killed by %s.", command);
//                    System.out.printf("Best room: %d", bestRoom);
//                    isALife = false;
//                }
//            }
//        }
//        if (isALife) {
//            System.out.println("You've made it!");
//            System.out.printf("Bitcoins: %d", bitcoins);
//            System.out.printf("Health: %d", health);
//        }

//        int days = Integer.parseInt(scanner.nextLine());
//        int dailyPlunder = Integer.parseInt(scanner.nextLine());
//        int expectedPlunder = Integer.parseInt(scanner.nextLine());
//
//        double totalPlunder = 0;
//        double percentage = 0;
//
//
//        //Calculate how much plunder the pirates manage to gather. Each day they gather plunder.
//        for (int i = 1; i <= days; i++) {
//            totalPlunder += dailyPlunder;
//            //Keep in mind that every third day they attack more ships and they
//            // add additional plunder to their total gain which is 50% of the daily plunder.
//            if (i % 3 == 0){
//                totalPlunder += dailyPlunder * 0.50;
//            }
//            //Every fifth day the pirates encounter a warship and after the battle they lose 30% of their total plunder.
//            if (i % 5 == 0){
//                totalPlunder -= totalPlunder * 0.30;
//            }
//        }
//        //If the gained plunder is more or equal to the target print the following:
//        if (totalPlunder >= expectedPlunder){
//            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
//        }else {
//            percentage = (totalPlunder / expectedPlunder) * 100;
//            System.out.printf("Collected only %.2f%% of the plunder.",percentage);
//        }

//        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
//
//        String command = scanner.nextLine();
//
//        while (!command.equals("Yohoho!")) {
//            String[] token = command.split(" ");
//            String input = token[0];
//
//            switch (input) {
//                case "Loot":
//                    for (int i = 0; i < token.length; i++) {
//                        if (!loot.contains(token[i])) {
//                            loot.remove(token[i]);
//                            loot.add(0, token[i]);
//                        }
//                    }
//                    break;
//                case "Drop":
//                    int index = Integer.parseInt(token[1]);
//                    if (index < 0 || index >= loot.size()) {
//                        break;
//                    }
//                    loot.add(loot.remove(index));
//                case "Steal":
//                    int count = Integer.parseInt(token[1]);
//                    List<String> stolen = new ArrayList<>();
//                    String output = "";
//
//                    if (count > loot.size()) {
//                        output = String.join(", ", stolen);
//                        loot.clear();
//                        break;
//                    }
//
//                    for (int i = 0; i < count; i++) {
//                        int lastIndex = loot.size() - 1;
//                        //в столен добаям последния индекс, а от лот го изтривам
//                        stolen.add(loot.remove(lastIndex));
//                    }
//                    Collections.reverse(stolen);
//                    output = String.join(", ", stolen);
//                    System.out.println(output);
//                    break;
//            }
//            command = scanner.nextLine();
//        }
//         int AverageTreasure = 0;
//
//        for (String sum: loot) {
//            AverageTreasure += loot.size();
//        }
//
//        if (AverageTreasure == 0){
//            System.out.print("Failed treasure hunt.");
//        }else {
//            double averageGain = 1.0 * AverageTreasure / loot.size();
//            System.out.printf("Average treasure gain: {averageGain} pirate credits.", averageGain);
//        }

//        int energy = Integer.parseInt(scanner.nextLine());
//
//        String command = scanner.nextLine();
//        int countOfWonBattles = 0;
//
//        while (!command.equals("End of battle")) {
//            int distance = Integer.parseInt(command);
//
//            if (energy >= distance) {
//                    energy -= distance;
//                countOfWonBattles ++;
//            }else {
//                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countOfWonBattles, energy);
//                return;
//            }
//
//            if (countOfWonBattles % 3 == 0){
//                energy  += countOfWonBattles;
//            }
//            command = scanner.nextLine();
//        }
//        System.out.printf("Won battles: %d. Energy left: %d", countOfWonBattles,energy);

//        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        String command = scanner.nextLine();
//        int counter = 0;
//
//        while (!command.equals("End")) {
//            int index = Integer.parseInt(command);
//
//            if (index < 0 || index > targets.length) {
//                for (int i = 0; i < targets.length; i++) {
//                    int temp = targets[index];
//
//                    if (targets[i] != -1 && i != index) {
//                        if (targets[i] > temp) {
//                            targets[i] -= temp;
//                        }else {
//                            targets[i] += temp;
//                        }
//                    }
//                }
//                targets[index] = -1;
//                counter++;
//            }
//            command = scanner.nextLine();
//        }
//        System.out.printf("Shot targets: %d ->" + String.join(" "), counter);
//
//        for (int sum: targets) {
//            System.out.print(sum + " ");
//        }


        //Класове и обекти

        //Class car, employee, products-съдържат общите характеристики за всички коли Шкода от клас Шкода,
        // реално описва какво има всеки един от обектите



    }
}

