package ProgrammingFundamentalsRetakeExam6January2017;

import java.time.LocalTime;
import java.util.Scanner;

public class SinoTheWalker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // LocalTime time = LocalTime.parse();
        System.out.print("Enter first time (hh:mm aa): ");
        int numberOfSteps = Integer.parseInt(scanner.nextLine());
        int timeInSecondsForEachStep = Integer.parseInt(scanner.nextLine());

        double stepsToSeconds = numberOfSteps * timeInSecondsForEachStep;
        double stepsToMinutes = stepsToSeconds / 60;
        double stepsToHours = stepsToMinutes / 60;



        System.out.printf("Time Arrival: %.02f:%.02f:%.02f",stepsToHours, stepsToMinutes,stepsToSeconds);
    }
}
