package AssociativeArrays.Lab;

import java.text.DecimalFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read an array of real numbers (double).- т.е това ми входа -8 2 2 8 2
//        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToDouble(Double::parseDouble).toArray();
//
//         //тук са подредени според ключа във възходящ ред
//        Map<Double, Integer> counts = new TreeMap<>();
//
//        //мини през всяко едно число от масива nums
//        for (double number : nums) {
//            // и ако числото го няма в Мапа като ключ
//            if (!counts.containsKey(number)) {
//                //put - се използва за добавяне или промяна на елементи
//                counts.put(number, 1);
//            }else {
//                //вземи number
//                int occurrence = counts.get(number);
//                //увеличи го с 1
//                occurrence++;
//                // добави числото в мапа counts
//                counts.put(number, occurrence);
//            }
//        }
//     //Pass through all numbers num in the map and print the number and its count of occurrences after formatting it to a decimal place without trailing zeros
//        for (Map.Entry<Double, Integer>entry : counts.entrySet()) {
//            DecimalFormat df = new DecimalFormat("#.#######");
//            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
//        }

//        Map<String, ArrayList<String>> synonymDictionary = new LinkedHashMap<>();
//
//        int countOfPairs = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < countOfPairs; i++) {
//            //прочитаме една дума от конзолата
//            String word = scanner.nextLine();
//            //прочитаме един синоним от конзолата
//            String synonym = scanner.nextLine();
//
//            if (!synonymDictionary.containsKey(word)){
//                //правим нов лист в който да държим синонимите за текущата дума
//                List<String>synonymForCurrentWord = new ArrayList<>();
//                //добави синомима в листа на последна позиция
//                synonymForCurrentWord.add(word);
//                //добавяме думата и синомима за текущата дума в мапа
//                synonymDictionary.put(word, synonymForCurrentWord);
//
//            }else {
//                //от речника ми дай тази дума
//            List<String>synonymForCurrentWord = synonymDictionary.get(word);
//            //добави думата и синонима в мапа
//            synonymDictionary.put(word,synonymForCurrentWord);
//            }


        //1.Read an array of strings
//        String[] words =scanner.nextLine().split(" ");
        //Filter those whose length is even
//        Arrays.stream(words).filter(w -> w.length() % 2 == 0).forEach(System.out::println);


    }
}
