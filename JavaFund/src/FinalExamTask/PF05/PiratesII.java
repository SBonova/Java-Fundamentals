package FinalExamTask.PF05;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PiratesII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //два мапа за популацията на града и вторият за златотов града
        Map<String, Integer> cityPopulation = new TreeMap<>();
        Map<String, Integer> cityGold = new TreeMap<>();

        while (!input.equals("Sail")) {
            String[] cities = input.split("[|]{2}");
            String cityName = cities[0];
            int population = Integer.parseInt(cities[1]);
            int gold = Integer.parseInt(cities[2]);

            //If you receive a city which has been already received, you have to increase the population and gold with the given values.
            //ако грдаът го няма го добави на 0-лева позиция
            cityPopulation.putIfAbsent(cityName, 0);
            //вземаме текущата популация на града
            int currentPopulation = cityPopulation.get(cityName);
            //ъпдейтваме мапа
            cityPopulation.put(cityName, currentPopulation + population);

            cityGold.putIfAbsent(cityName, 0);
            int currentGold = cityGold.get(cityName);
            cityGold.put(cityName, currentGold + gold);

            input = scanner.nextLine();
        }
        String secondInput = scanner.nextLine();
        while (!secondInput.equals("End")) {
            String[] commandInput = secondInput.split("=>");
            String command = commandInput[0];
            String town = commandInput[1];

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(commandInput[2]);
                    int gold = Integer.parseInt(commandInput[3]);


                    int leftPeoples = cityPopulation.get(town) - people;
                    cityPopulation.put(town, leftPeoples);

                    int leftGold = cityGold.get(town) - gold;
                    cityGold.put(town, leftGold);


                    if (leftPeoples > 0 && leftGold > 0) {
                        //For every town you attack print this message: "{town} plundered! {gold} gold stolen, {people} citizens killed."
                        System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n", town, gold, people);
                    } else {//If any of those two values (population or gold) reaches zero, the town is disbanded.
                        //You need to remove it from your collection of targeted cities and print the following message: "{town} has been wiped off the map!"
                        cityPopulation.remove(town);
                        cityGold.remove(town);
                        System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n", town, gold, people);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    int amountGold = Integer.parseInt(commandInput[2]);

                    //The gold amount can be a negative number, so be careful. If a negative amount of gold is given print:
                    // "Gold added cannot be a negative number!" and ignore the command.
                    if (amountGold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        //взимаме текущтото злато на града
                        int currentGold = cityGold.get(town);
                        //увеличаме златото на града с полученото злато
                        cityGold.put(town,currentGold + amountGold);
                        //ъпдейтваме мапа с новият балнс на златото в града
                        int newBalance = cityGold.get(town);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",amountGold,town,newBalance);
                    }
                    break;
            }
            secondInput = scanner.nextLine();
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",cityGold.size());

        cityGold.entrySet().stream()
                //sorted by their gold in descending order
                .sorted((t1,t2) -> Integer.compare(t2.getValue(),t1.getValue()))
                //then by their name in ascending order,
                .forEach(town ->{
                    String townName = town.getKey();
                    //in the following format:{town1} -> Population: {people} citizens, Gold: {gold} kg
                    System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",town.getKey(),cityPopulation.get(townName),town.getValue());
                });
    }
}
