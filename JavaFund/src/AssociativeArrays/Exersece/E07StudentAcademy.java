package AssociativeArrays.Exersece;

import java.util.*;

public class E07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //On the first line you will receive number n.
        int n = Integer.parseInt(scanner.nextLine());

        //After that you will receive n pair of rows.
        // First you will receive the student's name, after that you will receive his grade.
        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grades = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(studentName)) {
                students.put(studentName, new ArrayList<>());
                students.get(studentName).add(grades);
            }else {
                students.get(studentName).add(grades);
            }

        }

        //When you finish reading data, keep students with average grade higher or equal to 4.50.
        Map<String, Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double grade = entry.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (grade >= 4.50) {
               averageGrade.put(entry.getKey(), grade);
            }
        }

        //Order filtered students by average grade in descending order.
        averageGrade.entrySet().stream().sorted((g1, g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(grades ->{
                    System.out.println(String.format("%s -> %.2f", grades.getKey(),grades.getValue()));
                });


        //desending order
//        studentAcademy.entrySet().stream().sorted((e1, e2) ->
//                Integer.compare(e2.getValue().size(), e1.getValue().size()))
//                .forEach(entry -> {
//                    //key: Името на курса
//                    //value: списък с хора
//                    //име на курса -> бр.хората
//                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
//                    List<String> s = entry.getValue();
//                    students.stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
//                    //asending order - нарастващ ред от по-голямо към по-малко
//                });


    }
}
