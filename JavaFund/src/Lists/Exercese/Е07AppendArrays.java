package Lists.Exercese;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.list;

public class Е07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String>list = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(list);
        // "[  7  8, 4 5 6 , 1 2 3 ]"
        // replace [ -> "  7  8, 4 5 6 , 1 2 3 ]"
        // replace ] -> "  7  8, 4 5 6 , 1 2 3 "
        // replace , -> "  7  8 4 5 6  1 2 3 "
        //trim() -> "7  8 4 5 6  1 2 3"
        //replace more than one interval -> "7 8 4 5 6 1 2 3"

        System.out.println(list.toString().replace("[", "")
        .replace("]", "")
        .replaceAll(",", "")
        .trim()
        .replaceAll("\\s+", " "));

    }
}
