package Arrays.Exercise;

import java.util.Scanner;

public class E01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] days = new String[7];
//
//        for (int i = 0; i < days.length; i++) {
//         String line = scanner.nextLine();
//         days[i] = line;
//        }
//
//        for (int i = 0; i < days.length; i++) {
//            System.out.println(days[i]);
//        }

        int n = Integer.parseInt(scanner.nextLine());
        int[] trains = new int[n];
        int people = 0;


        for (int i = 0; i < n; i++) {
            trains[i] = Integer.parseInt(scanner.nextLine());
            people += trains[i];
        }

        for (int i = 0; i < trains.length; i++) {
            System.out.print(trains[i] + " ");
        }
        System.out.println();
        System.out.println(people);
    }
}
