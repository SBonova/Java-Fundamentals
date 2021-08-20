package Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<Double>numberList = new ArrayList<>();
        String[] userInput = scanner.nextLine().split(" ");
//
//        for (String stringNumber:userInput) {
//            numberList.add(Double.parseDouble(stringNumber));
//        }
        List<Double> numberList = Arrays.stream(userInput)
                .map(Double::parseDouble)
                .collect(Collectors.toList());
// number.size() * 1 -ни дава колко елемента има в масива, които ни се подава от потрбителя
        for (int i = 0; i < numberList.size() - 1; i++) {
            //вземи елемента на i-ta позиция(0) и ако са равни вземи елемента от следващата позиция(1)
            if (numberList.get(i).equals(numberList.get(i + 1))) {
                //събери елемента i-ta poziciq (0) s елемента от масива на следващата позиция(1)
                double sum = numberList.get(i) + numberList.get(i + 1);
                //прибери числото от sum
                numberList.set(i, sum);
                //изтрии i-ta oziciq + 1 (1)
                numberList.remove(i + 1);
                i = -1;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        //колко елемента са останали в numberList (size= 2)
        for (Double number : numberList) {
            //принтирай number с " "
            System.out.print(decimalFormat.format(number) + " ");
        }
    }
}
