package DataTypesAndVariables.Exercise2;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int numberOfPeopleN = Integer.parseInt(scanner.nextLine());
//        int capacityP = Integer.parseInt(scanner.nextLine());
//
//        int courses = numberOfPeopleN / capacityP;
//
//
//        if (numberOfPeopleN <= capacityP) {
//            System.out.println("1");
//        } else if (numberOfPeopleN % capacityP == 0) {
//            System.out.println(courses);
//        } else {
//            courses += 1;
//            System.out.println(courses);
//        }

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(people * 1.0 / capacity);
        System.out.printf("%.0f", courses);
    }
}

