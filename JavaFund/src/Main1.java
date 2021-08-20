import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Student svetla = new Student("Svetla", "Bonova", 34, "Sofia");
//        System.out.println(svetla);

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String [] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String homeTown = tokens[3];

//            if (isAlreadyExsit(firstName, lastName, students))
//            Student student = new Student(firstName, lastName, age, homeTown);
//            student.

            input = scanner.nextLine();
        }
//        String homeTown = scanner.nextLine();
//        for (:
//             ) {
//
//        }
    }

//    private static boolean isAlreadyExsit() {
//        for (:
//             ) {

//        }
//    }
}
