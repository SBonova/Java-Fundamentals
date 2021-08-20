package AssociativeArrays.Exersece;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Map<String,String> parkingUsers  = new LinkedHashMap<>();
//        int NumberCommand = Integer.parseInt(scanner.nextLine());
//
//
//        for (int i = 0; i < NumberCommand; i++) {
//            String input = scanner.nextLine();
//            String[] data = input.split(" ");
//            String operation = data[0];
//            String userName = data[1];
//
// //"register {username} {licensePlateNumber}":
//            if (operation.equals("register")){
//                String plateNumber = data[2];
//                if (!parkingUsers.containsKey(userName)) {
//                    parkingUsers.put(userName, plateNumber);
//                    System.out.printf("%s registered %s successfully%n", userName, plateNumber);
//                }else {// if a user tries to register another license plate, using the same username
//                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
//                }
//                //"unregister {username}":
//            }else if (operation.equals("unregister")){
//                //If the user is not present in the database
//                if (!parkingUsers.containsKey(userName)){
//                    System.out.printf("ERROR: user %s not found%n", userName);
//                }else {
//                    System.out.printf("%s unregistered successfully%n", userName);
//                }
//
//            }
//        }
//        //After you execute all of the commands, print all the currently registered users and their license plates in the format:
//        //    • "{username} => {licensePlateNumber}"
//        parkingUsers .forEach((key, value) ->
//                System.out.println(String.format("%s => %s", key, value)));

        Map<String, String> parkingUsers = new LinkedHashMap<>();
        int numberCommand = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberCommand; i++) {
            String command = scanner.nextLine();
            String[] tokens = command.split(" ");
            String operation = tokens[0];
            String name = tokens[1];

            if (operation.equals("register")) {
                String plateNumber = tokens[2];
                if (!parkingUsers.containsKey(name)) {
                    parkingUsers.put(name, plateNumber);
                    System.out.printf("%s registered %s successfully%n", name, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
            } else if (operation.equals("unregister")) {
                if (!parkingUsers.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    parkingUsers.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }

        parkingUsers
                .forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}
