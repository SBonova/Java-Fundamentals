package ObjectsAndClasses.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class E01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Classes ot tqh -> Object
        //set- sloji
        //get- vzemi
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random rnd = new Random();

        while (words.size() > 0){
            String word = words.remove(rnd.nextInt(words.size()));
            System.out.println(word);
        }
    }
}
