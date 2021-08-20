package AssociativeArrays.Lab;

import java.util.*;

public class Lection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Key ,  Value
        Map<String, Integer> students = new HashMap<>();
        students.put("Gosho", 4);
        students.put("Pesho", 3);
        students.put("Vanko", 6);

        students.remove("Vanko");
        System.out.println(students.containsKey("Gosho"));
        System.out.println(students.containsValue(6));

        //дай ми информацията за всеки един студент : от
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey());
            System.out.println(student.getValue());
        }

        //При HashMap пази елементи-Entry с уникални ключове без да знаем реда на елементите, т.е тук ред няма

        //LinkedHashMap- пази елементите с уникален ключ и в редът във който сме ги добавили, т.е тук редът е редът на вкарване

        //TreeMap- пази елементите във дърво, elementite-Entry- ще бъдат сортирани според техният ключ. т.е тук са подредени според ключа във възходящ ред

        //намираме средната стойност от числата
        List<String>nums = Arrays.asList("1", "2", "3");
        double avg = nums.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .getAsDouble();

        //минималната сума
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).min().orElse(3);

        String[] words = {"abc", "def", "geh", "yyy"};
        words = Arrays.stream(words)
                .map(element -> element + "yyy")
                .map(element -> element + "Pesho")
                .toArray(String[]::new);

        System.out.println();


        //принтира числата които са по-големи от 0
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(n -> n > 0)
                .forEach(element -> System.out.println(element));

        //Stream
        //IntStream -> sum, average, min, max
        //mapToInt -> превръща Stream v intStream
        //map -> превръща Stream v Stream
        //mapToDouble -> превръща Stream v DoubleStream
        //sum -> връща сумата или 0
        //average - връща OptionalDouble
        //min,max -> Optional
        //foreach- > минава през всеки един елемент
        //filter -> филтрира елелементите
        //sorted- сортира колекции от данни

        List<Integer>num = Arrays.asList(1, 5, 8, 4);
        num.stream()
                .sorted((leftDigit, rightDigit) -> leftDigit.compareTo(rightDigit))
                .forEach(System.out::println);

        //спорд числото разбираме, кои от елементите трябва да оставим
        //отрицателно число- десният елемент е по голям от левия
        //0-означава че двата елемента са равни
        //положително число- левият елемнт е по голям от десния

Map<Integer, String>products = new HashMap<>();
products.put(2, "watermelon");
products.put(4, "oranges");
products.put(8, "apples");
    products.entrySet()
            .stream()
            .sorted((leftEntry, rightEntry) -> {
        int result = rightEntry.getValue().compareTo(leftEntry.getValue());
     //   if (result = leftEntry.getKey().compareTo(rightEntry.getKey());
        if (result == 0)
            result = leftEntry.getKey().compareTo(rightEntry.getKey());
        return result;
        })
            .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
