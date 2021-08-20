package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        int day = scanner.nextInt();
        if (1 <= day && 7 >= day) {
            System.out.println(dayOfWeek[day - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
