package FinalExamTask.ProgrammingFundamentalsFinalExamRetake_03;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeedIII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        //On the next n lines the cars themselves will follow with their mileage and fuel available, separated by "|" in the following format:
        //{car}|{mileage}|{fuel}
        Map<String, Integer> parking = new TreeMap<>();
        Map<String, Integer> roadTrip = new TreeMap<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] carPark = scanner.nextLine().split("\\|");
            String car = carPark[0];
            int mileage = Integer.parseInt(carPark[1]);
            int fuel = Integer.parseInt(carPark[2]);

            parking.put(car, mileage);
            roadTrip.put(car, fuel);
        }
        //Then, you will be receiving different commands, each on a new line,
        // separated by " : ", until the "Stop" command is given:
        String command = scanner.nextLine();

        while (!command.equals("Stop")){
            String[] tokens = command.split(" : ");
            String cases = tokens[0];

            switch (cases){
                case "Drive"://Driv : {car} : {distance} : {fuel}
                    String carTo = tokens[1];
                    int distance = Integer.parseInt(tokens[2]);
                    int fuel = Integer.parseInt(tokens[3]);

                    //You need to drive the given distance and you will need the given fuel to do that. If the car doesn`t have enough fuel print:
                    //"Not enough fuel to make that ride"
                    if (fuel >= roadTrip.get(carTo)){
                        System.out.println("Not enough fuel to make that ride");
                    }else {
                        int currentM = parking.get(carTo);
                        parking.put(carTo,(currentM + distance));
                        //If the car has the required fuel available in the tank, increase its mileage with the given distance,
                        // decrease its fuel with the given fuel and print:
                        int currentF= roadTrip.get(carTo);
                        roadTrip.put(carTo,(currentF-fuel));
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.", carTo,distance,fuel);
                        System.out.println();
                        //You like driving new cars only, so if the mileage of a car reaches 100 000 km, remove it from the collection(s).
                        if ((currentM + distance) > 100000){
                            parking.remove(carTo);
                            roadTrip.remove(carTo);
                            System.out.printf("Time to sell the %s!",carTo);
                            System.out.println();
                        }
                    }
                    break;
                case "Refuel"://{car} : {fuel}
                    String carRefuel = tokens[1];
                    int fuelCar = Integer.parseInt(tokens[2]);

                    int currentFuel = roadTrip.get(carRefuel);

                    //Each tank can hold a maximum of 75 liters of fuel, so if the given amount of fuel is more than you can fit in the tank, take only what is required to fill it up.
                    if ((currentFuel + fuelCar)>75){
                        roadTrip.put(carRefuel,75);
                        System.out.printf("%s refueled with %d liters",carRefuel,(75-currentFuel));
                        System.out.println();
                    }else {
                        roadTrip.put(carRefuel,(fuelCar+currentFuel));
                        System.out.printf
                                ("%s refueled with %d liters",carRefuel,(fuelCar));
                        System.out.println();
                    }
                    break;
                case "Revert": //{car} : {kilometers}
                    String carRevert = tokens[1];
                    int kilometers = Integer.parseInt(tokens[2]);

                    //If the mileage becomes less than 10 000km after it is decreased, just set it to 10 000km and
                    //DO NOT print anything.
                    int currentKilometers = roadTrip.get(carRevert);

                     if ((currentKilometers - kilometers) < 100000){
                        roadTrip.put(carRevert, 100000);
                    }else {//Decrease the mileage of the given car with the given kilometers
                         // and print the kilometers you have decreased it
                         roadTrip.put(carRevert,(currentKilometers - kilometers));
                         System.out.printf("%s mileage decreased by %d kilometers",carRevert,kilometers);
                         System.out.println();
                      }
                    break;
            }
            command = scanner.nextLine();
        }
           parking.entrySet().stream()
                   //sorted by their mileage in decscending order,
                   .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                  //.sorted((n1, n2) ->n2.getKey().compareTo(n1.getKey)))
                   //then by their name in ascending order,
                 .forEach(n ->{
                     String name = n.getKey();
                     int name4 = n.getValue();
                     int name5 = roadTrip.get((name));
                     System.out.printf
                             ("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", name, name4, name5);
                     System.out.println();
                 });

    }
}
