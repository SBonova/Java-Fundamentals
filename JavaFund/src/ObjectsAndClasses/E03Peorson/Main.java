package ObjectsAndClasses.E03Peorson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String personalData = scanner.nextLine(); //"Peter 12"
            String[] splitData = personalData.split("\\s+"); // ["Peter", "12"]
            String name = splitData[0];
            int age = Integer.parseInt(splitData[1]);

            Person person = new Person(name, name, age);
            if (person.getAge() > 30) {
                people.add(person);
            }

        }

        //филтрация
        // people.stream().filter(person ->person.getAge() > 30).collect(Collectors.toList());

        //този компаратор сравнява всички обекти от пърсани по име
        people.sort(Comparator.comparing(Person::getName));

        for (Person person : people) {
           //Itan - 48
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

