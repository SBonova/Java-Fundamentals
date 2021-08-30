package FinalExamTask.PreparationFE_02;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plantNumber = Integer.parseInt(scanner.nextLine());
        Map<String, PlantData> currentPlants = new LinkedHashMap<>();
        for (int i = 0; i < plantNumber; i++) {
            String plantText = scanner.nextLine();
            String[] plantParts = plantText.split("<->");

            String plantName = plantParts[0];
            int plantRarity = Integer.parseInt(plantParts[1]);
            PlantData newPlant = new PlantData(new ArrayList<>(), plantRarity);
            currentPlants.put(plantName, newPlant);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandParts = command.split(": | \\- ");
            String commandName = commandParts[0];
            String plantName = commandParts[1];
            if (!currentPlants.containsKey(plantName)) {
                command = scanner.nextLine();
                System.out.println("error");
                continue;
            }

            switch (commandName) {
                case "Rate":
                    int rating = Integer.parseInt(commandParts[2]);
                    currentPlants.get(plantName).addRating(rating);
                    break;
                case "Update":
                    int rarity = Integer.parseInt(commandParts[2]);
                    currentPlants.get(plantName).setRarity(rarity);
                    break;
                case "Reset":
                    currentPlants.get(plantName).removeAllRating();
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");


        currentPlants
                .entrySet()
                .stream()
                .sorted((plant1, plant2) -> {
                    int result = Integer.compare(plant2.getValue().getRarity(), plant1.getValue().getRarity());
                    if (result == 0) {
                        result = Double.compare(plant2.getValue().getAverageRating(), plant1.getValue().getAverageRating());
                    }
                    return result;
                })
                .forEach(p -> System.out.printf("- %s; Rarity: %s; Rating: %.2f%n",
                        p.getKey(),
                        p.getValue().getRarity(),
                        p.getValue().getAverageRating()));
    }
}

class PlantData {
    private List<Integer> ratings;
    private int rarity;

    public List<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public PlantData(List<Integer> rating, int rarity) {
        this.ratings = rating;
        this.rarity = rarity;
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public void removeAllRating() {
        this.ratings.clear();
    }

    public double getAverageRating() {
        double sumOfRatings = 0.0;
        for (Integer rating : this.ratings) {
            sumOfRatings += rating;
        }
        if(sumOfRatings == 0){
            return 0;
        } else {
            return sumOfRatings / this.ratings.size();
        }
    }
}
