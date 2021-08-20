package AssociativeArrays.Lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPairs = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();

        for (int i = 0; i < countOfPairs; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymDictionary.containsKey(word)){
                List<String>synonymForCurrentWord = new ArrayList<>();
                synonymForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymForCurrentWord);
            }else {
                List<String> synonymForCurrentWord = synonymDictionary.get(word);
                synonymForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymForCurrentWord);

               // synonymDictionary.get(word).add(synonym);
                //от речника дай ми тази дума и добави нова дума синоним
            }
        }
        //API-Application Programming Interface

        for (Map.Entry<String, List<String>> entry : synonymDictionary.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(), String.join(", ", entry.getValue()));

        }
    }
}
