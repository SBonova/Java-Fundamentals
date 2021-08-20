package Lists.Exercese;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Е06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        //сравнява дали двата листа са по-големи от 0
        while (playerOne.size()>0 && playerTwo.size()>0){

            //пази стойността на първият елемент т.е на 0-лева позиция
            int firstPlayerCard=playerOne.remove(0);
            int secondPlayerCard=playerTwo.remove(0);

            //Ако първата карта на първият игра е по-голяма от тази на вторият играч
            if(firstPlayerCard>secondPlayerCard){
                //добави към листа на първият играч картата на вторият играч
                playerOne.add(firstPlayerCard);
                playerOne.add(secondPlayerCard);
            }else if(secondPlayerCard>firstPlayerCard){
                playerTwo.add(secondPlayerCard);
                playerTwo.add(firstPlayerCard);
            }

        }

        if (playerOne.size()>0)
            sumAndPrint(playerOne, "First");
        else if (playerTwo.size()>0)
            sumAndPrint(playerTwo, "Second");
    }
    private static void sumAndPrint(List<Integer> playerWiner, String player){
        int sum = 0;
        for (int element: playerWiner)
            sum+=element;
        System.out.println(player + " player wins! Sum: " + sum);
    }

    private static void compareCards(List<Integer> winnerList, List<Integer> loserList, boolean isCardSame){
        if (!isCardSame) winnerList.add(winnerList.get(0));
        if (!isCardSame) winnerList.add(loserList.get(0));
        winnerList.remove(0);
        loserList.remove(0);
    }
}
