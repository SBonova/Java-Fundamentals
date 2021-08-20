package MidExam.E05MidExam;

import java.util.*;

public class Е01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NumberOfStudents = Integer.parseInt(scanner.nextLine());
        int CountOfTheLectores = Integer.parseInt(scanner.nextLine());
        int BonusPoints = Integer.parseInt(scanner.nextLine());

//Map имплементациите в Java са изключително полезни структури за съхраняване на ключ -> стойност релации.
// Най-честата употреба е извличането на елемент, асоцииран с даден ключ.
// Но в някои случаи се налага да се обходят всички елементи в картата.
// Тук ще покажем няколко примера как да стане това. Нека имаме следната структура:
        Map <Integer,Double> bonuses = new HashMap<>();

        bonuses.put(0, 0.00);

        for(int i= 0; i < NumberOfStudents; i++) {
            int attendceOfStudents = Integer.parseInt(scanner.nextLine());
            double totalBonus = (double)attendceOfStudents / CountOfTheLectores * (5 + BonusPoints);

            bonuses.put(attendceOfStudents, totalBonus);
        }

        //на всяка итерация се добавя по едно извличане на елемент.
        Map.Entry<Integer, Double> Max = bonuses.entrySet().stream()
                .max((a,b)->a.getValue().compareTo(b.getValue()))
                .get();

        System.out.printf("Max Bonus: %.0f.\nThe student has attended %s lectures.",Math.ceil(Max.getValue()),Max.getKey());
    }
}

