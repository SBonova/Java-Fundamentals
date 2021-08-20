package ObjectsAndClasses.E05Students;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> students = new ArrayList<>();

        int studentsCount = Integer.parseInt(scanner.nextLine());
        for (int student = 1; student <= studentsCount; student++) {
            String studentData = scanner.nextLine();
            String[] splitData = studentData.split("\\s+");
            String firstName =splitData[0];
            String lastName = splitData[1];
            double grade = Double.parseDouble(splitData[2]);

            //създаваме обект
            Students st = new Students(firstName, lastName, grade);
            students.add(st);
        }

        //desending by grade -> ascending -> reverse
       students = students.stream().sorted(Comparator.comparingDouble(Students::getGrade)).collect(Collectors.toList());
        Collections.reverse(students);

        for (Students s : students) {
            System.out.println(s.toString());
        }

    }
}
