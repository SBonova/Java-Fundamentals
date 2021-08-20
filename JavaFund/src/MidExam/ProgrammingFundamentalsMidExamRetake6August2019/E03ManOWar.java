package MidExam.ProgrammingFundamentalsMidExamRetake6August2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pirateShipInput = scanner.nextLine();
        String[] pirateShipInputSplit = pirateShipInput.split(">");
        List<Integer> pirateShip = new ArrayList<>();

        for (String currentSection : pirateShipInputSplit) {
            int sectionAsInteger = Integer.parseInt(currentSection);
            pirateShip.add(sectionAsInteger);
        }

        String warShipInput = scanner.nextLine();
        String[] warShipInputSplit = pirateShipInput.split(">");
        List<Integer> warShip = new ArrayList<>();

        for (String currentSection : warShipInputSplit) {
            int sectionAsInteger = Integer.parseInt(currentSection);
            warShip.add(sectionAsInteger);
        }

        int maxHealth = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Retrie")) {
            String[] commandArguments = command.split(" ");
            String commandName = commandArguments[0];
            switch (commandName) {
                case "Fire":
                    int fireIndex = Integer.parseInt(commandArguments[1]);
                    int damage = Integer.parseInt(commandArguments[2]);
                    //Check if the index is valid and if not skip the command.
                    if (fireIndex < 0 || fireIndex >= warShip.size()) {
                        break;
                    }
                    //the pirate ship attacks the warship with the given damage at that section
                    int sectionHealth = warShip.get(fireIndex);
                    sectionHealth -= damage;
                    //If the section breaks (health <= 0) the warship sinks, print the following and stop the program:
                    if (sectionHealth <= 0) {
                        System.out.println(" You won! The enemy ship has sunken.");
                        return;
                    } else {
                        warShip.set(fireIndex, sectionHealth); // warShip[fireIndex] = sectionHealth
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandArguments[1]);
                    int endIndex = Integer.parseInt(commandArguments[2]);
                    int damageDealt = Integer.parseInt(commandArguments[3]);

                   // Check if both indexes are valid and if not skip the command.
                    if (startIndex < 0 || startIndex >= pirateShip.size()) {
                        break;
                    }
                    if (endIndex < 0 || endIndex >= pirateShip.size()) {
                        break;
                    }
                    //the warship attacks the pirate ship with the given damage at that range (indexes are inclusive).
                    for (int i = startIndex; i <= endIndex; i++) {
                        int currentSection = pirateShip.get(i);
                        currentSection -= damageDealt;

                        //If the section breaks (health <= 0) the pirate ship sinks, print the following and stop the program:
                        if (currentSection <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        } else {
                            pirateShip.set(i, currentSection);
                        }

                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(commandArguments[1]);
                    int repairHealth = Integer.parseInt(commandArguments[2]);
                    //if the index is valid and if not skip the command.
                    if (repairIndex < 0 || repairIndex >= pirateShip.size()) {
                        break;
                    }
                    //the crew repairs a section of the pirate ship with the given health
                    int sectionToRepair = pirateShip.get(repairIndex);
                    sectionToRepair += repairHealth;
                    //The health of the section cannot exceed the maximum health capacity.
                    if (sectionToRepair > maxHealth) {
                        sectionToRepair = maxHealth;
                    }
                    pirateShip.set(repairIndex, sectionToRepair);
                    break;
                case "Status":
                    //prints the count of all sections of the pirate ship that need repair soon, which are all sections that are lower than 20% of the maximum health capacity. Print the following:
                    //"{count} sections need repair."
                    int count = 0;
                    for (Integer currentSection : pirateShip) {
                        if (currentSection < 0.2 * maxHealth) {
                            count++;
                        }
                    }
                    System.out.println(count + "sections need repair");
                    break;
            }
            command = scanner.nextLine();
        }
        int pirateShipStatus = 0;
        int warShipStatus = 0;

        for (Integer currentSection: warShip) {
            warShipStatus += currentSection;
        }
        for (Integer currentSection: pirateShip) {
            pirateShipStatus += currentSection;
        }
        System.out.println("Pirate ship status: " + pirateShipStatus);
        System.out.println("Warship status: " + warShipStatus);
    }
}

