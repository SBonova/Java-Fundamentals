package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class E03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = numOfPeople / capacity;

        if (numOfPeople <= capacity) {
            System.out.println("1");
        } else if (numOfPeople % capacity == 0){
            System.out.println(courses);
        }else {
            courses += 1;
            System.out.println(courses);
        }
    }
}
