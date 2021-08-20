package Arrays.Exercise;

import java.util.Scanner;

public class E02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      masiv ot stringove
//                pro4itame gi ot konzolata
//                trqbva da sravnim elementite na masiva ot parviq s vtoriq
//                for -> second array{vtori for -> firstArray {check secondArray[i].equals firstArray[i]}
//                if (sa ednakvi gi printirame)}

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (second[i].equals(first[j])) {
                    System.out.print(second[i] + " ");
                }
            }

        }
    }
}
