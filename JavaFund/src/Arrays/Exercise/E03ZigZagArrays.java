package Arrays.Exercise;

import java.util.Scanner;

public class E03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме броят на редовете от конзолата n
        int n = Integer.parseInt(scanner.nextLine());

        //създаваме два масива
        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 1; i <= n; i++) {
            String[] line = scanner.nextLine().split(" ");
            //проверяваме i дали е на четна или нечетна позиция
            if (i % 2 == 0) {
                first[i - 1] = Integer.parseInt(line[1]);
                second[i - 1] = Integer.parseInt(line[0]);
            }else {
                first[i - 1] = Integer.parseInt(line[0]);
                second[i - 1] = Integer.parseInt(line[1]);
            }
        }
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + " ");
        }
    }
}
