package AssociativeArrays.Exersece;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Прочитам текст
        //2.Обхождаме всички символи

        String text = scanner.nextLine();
        //символ -> брой на срещанията
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        //искам да взема всички елементи вкл. и последния
        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == ' '){
                continue;
            }
            //проверка вече имам ли такъв символ
            //ако не съм го срещала до момента този символ
            // ако не съдържа ключ за този символ в мапа
            if (!lettersCount.containsKey(currentSymbol)){
// дай ми моят мап lettersCount и към него ми дабави нов запис със символ и срещу него броя нс срещанията
                lettersCount.put(currentSymbol,1);

            }else {
                //ако съм го срещала
                //правим целочислена променлива currentCount-колко пъти
                // сме срещали променливата и казваме от моят мап
                // lettersCount и гетни-вземи ключа срещу който стой
                // стойността и връща стойността
                int currentCount = lettersCount.get(currentSymbol);//текущият брой си взимаме
                // дай ми моят мап lettersCount и ми сложи нов запис
                //срещу моят симбол искам да ми стой домоментният брой + 1
                lettersCount.put(currentSymbol, currentCount + 1);//текущият брой + 1
            }
        }
        // lettersCount.keySet() -> връща всички кючове
        // lettersCount.values() -> връща всички стойности
        // lettersCount.entrySet() -> връща всички записи(ключ -> стойност)

        //трябва да преминем през всички записи:{char} ->{occurance}
        //foreach
        for (Map.Entry<Character, Integer>entry : lettersCount.entrySet()) {
            //първо ми отпечатай ключа и след това ми сложи -> и накрая ми отпечатай стойността
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //отпечатване със stream
        //дай ми мапа lettersCount и по entrySet()ми вземи всички записи и пускаме един стрйм по тези записи
        //и ми направи форич за всеко едно ентри ми отпечатай ключа -> и стойноста
        //lettersCount.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}

