package Lists.Exercese;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Е09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>pokemonDistance = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int valueOfRomoveElements = 0;

        while (!pokemonDistance.isEmpty()){
            int command = Integer.parseInt(scanner.nextLine());
            int indexToRemove = 0;
            if (command < 0){
                indexToRemove = pokemonDistance.remove(0);
                valueOfRomoveElements += indexToRemove;
                pokemonDistance.add(0, pokemonDistance.get(pokemonDistance.size() - 1));
            }else if (command > pokemonDistance.size() - 1){
                indexToRemove = pokemonDistance.remove(pokemonDistance.size() - 1);
                pokemonDistance.add(pokemonDistance.get(0));
                valueOfRomoveElements += indexToRemove;
            }else {
                indexToRemove = pokemonDistance.remove(command);
                valueOfRomoveElements += indexToRemove;
            }

            for (int i = 0; i < pokemonDistance.size(); i++) {
                if (pokemonDistance.get(i) <= indexToRemove){
                    pokemonDistance.set(i, pokemonDistance.get(i) + indexToRemove);
                }else {
                    pokemonDistance.set(i, pokemonDistance.get(i) - indexToRemove);
                }
            }
        }
        System.out.println(valueOfRomoveElements);
    }
}
