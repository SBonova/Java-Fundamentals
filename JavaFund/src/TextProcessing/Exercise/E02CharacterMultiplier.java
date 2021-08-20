package TextProcessing.Exercise;

import java.util.Scanner;

public class E02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //a aaaa
      String[] input = scanner.nextLine().split(" ");

      char[] firstWord = input[0].toCharArray();//['a']
      char[] secondWord = input[1].toCharArray();//["a, a, a, a"]

        int shorterWord = Math.min(firstWord.length, secondWord.length);//1
        int longestWord = Math.max(firstWord.length, secondWord.length);//4

        int sum = 0;
        int temp = 0;

        for (int i = 0; i < shorterWord; i++) {
            temp = (int)firstWord[i] * (int)secondWord[i];// a * a = 97 * 97 = 9409
            sum += temp;// 9409
        }
        if (firstWord.length < secondWord.length){
            for (int i = shorterWord; i <= longestWord - 1; i++) {
                sum += secondWord[i];
            }
        }else if (firstWord.length > secondWord.length){
            for (int i = shorterWord; i <= longestWord - 1; i++) {
                sum += firstWord[i];//94090 + 97 +97 + 97 = 9700
            }
        }
        System.out.println(sum);
    }
}
