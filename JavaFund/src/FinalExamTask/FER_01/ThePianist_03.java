package FinalExamTask.FER_01;

import java.util.*;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You are a pianist and you like to keep a list of your favorite piano pieces.
        // Create a program, to help you organize it and add, change, remove pieces from it! -> Map

        //On the first line of the standard input you will receive an integer n – the number of pieces that you will initially have.
        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        //On the next n lines the pieces themselves will follow with their composer and key, separated by "|" in the following format:
        Map<String, List<String>> pieces = new TreeMap<>();

        for (int i = 0; i < numberOfPieces; i++) {
            String[] input = scanner.nextLine().split("\\|");
            //{piece}|{composer}|{key}
            String piece = input[0];
            String composer = input[1];
            String key = input[2];

            pieces.put(piece, new ArrayList<>());
            pieces.get(piece).add(composer);
            pieces.get(piece).add(key);
        }

        //Then, you will be receiving different commands, each on a new line,
        // separated by "|", until the "Stop" command is given:
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String[] commands = input.split("\\|");
            String command = commands[0];
            String piece = commands[1];

            switch (command){
                case "Add":
                    String composer = commands[2];
                    String key = commands[3];

                    //If the piece is already in the collection, print:
                    if (pieces.containsKey(piece)){
                        System.out.printf("%s is already in the collection!%n", piece);
                    }else if (!(pieces.containsKey(piece))){//If the piece is not in the collection, print:
                        //ако ги няма да ги добави в мапа, да вземе пиесата и да добави composer и key
                        pieces.put(piece, new ArrayList<>());
                        pieces.get(piece).add(composer);
                        pieces.get(piece).add(key);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece, composer, key);
                    }
                    break;
                case "Remove":
                    //If the piece is in the collection, remove it and print:
                    if (pieces.containsKey(piece)){
                        pieces.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    }else {//If the piece is not in the collection, print:
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey"://|{piece}|{new key}
                    String newKey = commands[2];

                  //If the piece is in the collection, change its key with the given one and print:
                    if (pieces.containsKey(piece)){
                        pieces.get(piece).set(1,newKey);
                        System.out.printf("Changed the key of %s to %s%n!",piece, newKey);
                    }else {
                        //If the piece is not in the collection, print:
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }

        //you need to print all pieces in your collection,
        pieces.entrySet().stream()
                //sorted by their name
                .sorted(Map.Entry.comparingByKey())
                //// and by the name of their composer in alphabetical order, //"{Piece} -> Composer: {composer}, Key: {key}"
                .forEach(composer -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        composer.getKey(),composer.getValue().get(0),composer.getValue().get(1)));

    }
}
