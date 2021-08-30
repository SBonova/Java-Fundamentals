package FinalExamTask.PFFE_04;

import java.util.*;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Map<String, Integer> phonebook = new HashMap<>();
//        phonebook.put("Ivan", 123);
//        phonebook.put("Ivan4o", 123);
//        phonebook.remove("Ivan4o");
//
//        phonebook.get("Ivan");
//
//        //списък с оценки
//        Map<String, List<Double>> students = new HashMap<>();
//        List<Double> grades = new ArrayList<>(Arrays.asList(2.3, 4.4, 5.50));
//        students.put("Alex", grades);
//
//        List<Double> alexGrades = students.get("Alex");
//        alexGrades.add(5.5);
//        students.put("Alex", alexGrades);


        //On the first line of the standard input you will receive an
        // integer n – the number of heroes that you can choose for your party.
        int countHeroes = Integer.parseInt(scanner.nextLine());

        //В маповете държим информацията за героите
        Map<String, Integer> heroesHP = new TreeMap<>();        //1.Map(Name of Hero -> HP)
        Map<String, Integer> heroesMP = new TreeMap<>();        //2.Map(Name of Hero -> MP)


        for (int hero = 0; hero <= countHeroes; hero++) {
            // On the next n lines, the heroes themselves will follow with their
            // hit points and mana points separated by empty space in the following format:
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String heroName = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);

            //{hero name} {HP} {MP}
            //  where HP stands for hit points and MP for mana points
            // a hero can have a maximum of 100 HP and 200 MP
            //valid hp
            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }

            // v mapa s MP
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }

        //You will be receiving different commands, each on a new line,
        // separated by " – ", until the "End" command is given.
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split(" - ");
            String commandName = tokens[0];
            String heroName = tokens[1];

            //There are several actions that can be performed by the heroes:
            switch (commandName) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    int mpCurrent = heroesMP.get(heroName);
                    //ako мога да направя магията ако -> текущото MP >= нужното
                    if (mpCurrent >= mpNeeded) {
                        //If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message:
                        int mpLeft = mpCurrent - mpNeeded;
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!", heroName, spellName, mpLeft);
                    } else {//If the hero is unable to cast the spell print:
                        System.out.printf("%s does not have enough MP to cast %s!", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    //ако нашият герой ако всеоще е жив-Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
                    int currentHP = heroesHP.get(heroName) - damage;//ъпдейтваме мапа
                    //alive
                    if (currentHP > 0) {
                        heroesHP.put(heroName, currentHP);//update na HP na geroq
                        System.out.printf("%s was hit for %d HP by and now has left!", heroName, damage, attacker, currentHP);
                    } else {//not alive-If the hero has died, remove him from your party and print:
                        System.out.printf("%s has been killed by %s!", heroName, attacker);
                        //трябва да го изтрием от двата мапа, ако е умрял
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int amountIncrease = Integer.parseInt(tokens[2]);
                    int currentMP = heroesMP.get(heroName);//вземи ми кюча heroName от мапа heroesMP и ми дай неговата стойност
                    int increaseMP = currentMP + amountIncrease;
                    if (increaseMP > 200) {
                        increaseMP = 200;
                    } else {
                        heroesMP.put(heroName, increaseMP); // новата стойност
                        System.out.printf("%s recharged for %d MP!", heroName, increaseMP - currentMP);
                    }
                    break;
                case "Heal":
                    int amount = Integer.parseInt(tokens[2]);
                    int currentHP1 = heroesHP.get(heroName);
                     int increaseHP = currentHP1 + amount;

                     if (increaseHP > 100){
                         increaseHP = 100;
                     }
                     heroesHP.put(heroName,increaseHP);
                    System.out.printf("%s healed for %d HP!", heroName, increaseHP - currentHP1);
                    break;
            }
            command = scanner.nextLine();
        }
        //имаме името на героя и неговото HP
        heroesHP.entrySet().stream().sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                //трябва да му отпечатам името
                .forEach(hero ->{
                    String heroName = hero.getKey();
                    System.out.println(hero.getKey());
                    System.out.println("  HP:" + hero.getValue());
                    System.out.println("  MP:" + heroesMP.get(heroName));
                });

    }
}
