package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Е04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTheTown = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km", nameOfTheTown, population, area );


    }
}
