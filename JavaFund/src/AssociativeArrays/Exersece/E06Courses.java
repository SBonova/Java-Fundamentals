package AssociativeArrays.Exersece;

import java.util.*;

public class E06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //име на курса -> списък с имената на студентите
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")){
            //"{име на курс} : {име на човек}"-> split(" : ") ->["{courseName}", {personName}];
            String courseName = input.split(" : ")[0];
            String personName = input.split(" ")[1];

            //има ли такъв курс
            //ако има такъв курс
            //ако взема мапа с courses и той не ми съдържа такъв
            // запис които да има такъв курс като запис
            if (!courses.containsKey(courseName)){
                //ми добави в мапа courses името на курса, и срещу него ми добави нов писък
                courses.put(courseName, new ArrayList<>());
            }
            //ако курсът е нов -> връща празен списък
            //ако курсът е стар -> връща моментния списък с хората
            //от мапа courses дай ми името на курса и ми добави името на курсистът
            courses.get(courseName).add(personName);

            input = scanner.nextLine();
        }

        //courseName -> List<String>
        //desending order
        courses.entrySet().stream().sorted((e1, e2) ->
                Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    //key: Името на курса
                    //value: списък с хора
                    //име на курса -> бр.хората
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    List<String>students = entry.getValue();
                    students.stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                    //asending order - нарастващ ред от по-голямо към по-малко
                });
        //courses.putIfAbsent()-добавя запис само ако няма такъв запис
    }
}
