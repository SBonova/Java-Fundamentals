package MidExam2MidExamProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class E01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeEfficiency1 = Integer.parseInt(scanner.nextLine());
        int employeeEfficiency2 = Integer.parseInt(scanner.nextLine());
        int employeeEfficiency3 = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int answerPerHour = employeeEfficiency1 + employeeEfficiency2 + employeeEfficiency3;

        int timeNeeded = 0;
        int days = 0;

        while (studentsCount > 0){
            studentsCount -= answerPerHour;
            timeNeeded++;
            if (timeNeeded % 4 == 0 && timeNeeded != 0){
                timeNeeded++;
//                if (timeNeeded >= 24){
//                    days++;
//                    timeNeeded = timeNeeded - 24;
//                }
            }
        }
        System.out.printf("Time needed: %dh.", timeNeeded);
    }
}
