package MidExam.ProgrammingFundamentalsMidExamRetake6August2019;

import java.util.*;
import java.util.stream.Collectors;

public class E02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String treasureChestContent = scanner.nextLine();
//        //Gold|Silver|Bronze|MedalLion|Cup
//        String[] splitChest = treasureChestContent.split("\\|");
//        List<String>chestContentList = new ArrayList<>(Arrays.asList(splitChest));

        List<String> chestContentList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("Yohoho!")) {
            String[] commandArray = command.split(" ");
            String currentCommand = commandArray[0];
            switch (currentCommand) {
                case "Loot":
                    for (int i = 1; i < commandArray.length; i++) {
                        if (!chestContentList.contains(commandArray[i])) {
                            chestContentList.add(0, commandArray[i]);
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandArray[1]);
                    if (dropIndex < 0 || dropIndex >= chestContentList.size()) {
//                       String item = chestContentList.remove(dropIndex);
//                       chestContentList.add(item);
                        break;
                    }
                    //съкратен запис на горните два реда
                    chestContentList.add(chestContentList.remove(dropIndex));
                    break;
                    //командата е Steal
                case "Steal":
                    //елемента на първи индекс е stealAmount
                    int stealAmount = Integer.parseInt(commandArray[1]);
                    //someone steals the last count loot items
                    List<String> stolen = new ArrayList<>();

                    String output = "";
                    //ако са откраднали повевче отколкото има в ковчежето да зачисти листа
                    if (stealAmount >= chestContentList.size()) {
                        output = String.join(", ", chestContentList);
                        chestContentList.clear();
                        break;
                    }

                    //Ако елементите са по-малко от дадения брой, премахнете толкова, колкото са.
                    for (int i = 0; i < stealAmount; i++) {
                        int lastIndex = chestContentList.size() - 1;
                        stolen.add(chestContentList.remove(lastIndex));
                    }
                    //Print the stolen items separated by ', '
                    Collections.reverse(stolen);
                    output = String.join(", ", stolen);
                    System.out.println(output);
                    break;
            }
            command = scanner.nextLine();
        }
        //В края изведете средната печалба на съкровището,
        // която е сумата от дължината на всички елементи на съкровището,
        // разделена на броя на всички предмети в сандъка,
        int totalSizeOfLoot = 0;

        for (String currentLoot : chestContentList) {
            totalSizeOfLoot += currentLoot.length();
        }

        //If the chest is empty print the following message:
        if (totalSizeOfLoot == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double average = 1.0 * totalSizeOfLoot / chestContentList.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }

    }
}


