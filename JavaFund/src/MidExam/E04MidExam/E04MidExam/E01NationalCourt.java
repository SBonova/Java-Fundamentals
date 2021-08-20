package MidExam.E04MidExam.E04MidExam;

import java.util.Scanner;

public class E01NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1Eff = Integer.parseInt(scanner.nextLine());
        int employee2Eff = Integer.parseInt(scanner.nextLine());
        int employee3Eff = Integer.parseInt(scanner.nextLine());
        int countPeople = Integer.parseInt(scanner.nextLine());

        int peopleEffPerHour = employee1Eff + employee2Eff + employee3Eff;

        int timeNeeded = 0;
        int days = 0;

        while (countPeople > 0) {
            countPeople -= peopleEffPerHour;
            timeNeeded++;
            if (timeNeeded % 4 == 0 && timeNeeded != 0) {
                timeNeeded++;
                if (timeNeeded >= 24) {
                    days++;
                    timeNeeded = timeNeeded - 24;
                }
            }
        }
        System.out.printf("Time needed: %dh.", days * 24  + timeNeeded);
    }
}
