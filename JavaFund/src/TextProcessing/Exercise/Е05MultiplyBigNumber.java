package TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class Е05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      // 1000 000 000 000 000 000- max sum na bigInteger
        String firstNumberStr = scanner.nextLine();//"214124124312312"
        BigInteger firstNumber = new BigInteger(firstNumberStr);

        String secondNumberStr = scanner.nextLine();//"3"
        BigInteger secondNumber = new BigInteger(secondNumberStr);

     //   System.out.println(firstNumber.add(secondNumber));//923847238931983192462832102 + 4
     //   System.out.println(firstNumber.subtract(secondNumber));//923847238931983192462832102 - 4
     //   System.out.println(firstNumber.divide(secondNumber));//923847238931983192462832102 / 4
        System.out.println(firstNumber.multiply(secondNumber)); //923847238931983192462832102 * 4



    }
}
