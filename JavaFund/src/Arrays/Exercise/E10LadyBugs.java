package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //колко ни е дълго полето
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] field = new int[n];
//
//        String[] bugsIndexes = scanner.nextLine().split(" ");
//
//        for (int i = 0; i < bugsIndexes.length; i++) {
//            //така се сетва полето първоначално
//            field[i] = 1;
//        }
//        //как прочитаме командите-със стринг
//        String line = scanner.nextLine();
//
//        while (!line.equals("end")){
//            String[] commands = line.split(" ");
//            int bugIndex = Integer.parseInt(commands[0]);
//            String direction = commands[1];
//            int flyLength = Integer.parseInt(commands[2]);
//
//            if (bugIndex < 0 || bugIndex >= field.length || field[bugIndex] != 1){
//                line = scanner.nextLine();
//                continue;
//            }
//
//            if (direction.equals("right")){
//                field[bugIndex] = 0;
//                while (field[bugIndex+flyLength] < field.length && field[bugIndex+flyLength] != 1){
//                    field[bugIndex+flyLength] = 1;
//                }
//
//            }else {
//
//            }
//
//
//            line = scanner.nextLine();
//        }
//        for (int i = 0; i < field.length; i++) {
//            System.out.print(field[i] + " ");
//        }

        //колко ни е дълго
        int fieldSize = Integer.parseInt(scanner.nextLine());
        //създаваме един едночислов масив, като големината му ще е равна на полето
        int[] field = new int[fieldSize];


        int[] ladyBugsIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();//съхраняваме индексите на който има калинка


        for (int ladyIndex : ladyBugsIndexes) {
            if (ladyIndex >= 0 && ladyIndex <= field.length - 1){
                //дайми полето и с/у този индекс който имам = ми сложи 1
                field[ladyIndex] = 1;
            }
        }
        //прочитай някаква команда докато неполучиш end
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            //command = "0 right 1"  -> split(" ") -> ["0", "right", "1"]
            //0 ot koj indeks se maha kalinka
            //right -> посока на движение
            //1 с каква дължина се мести калинката

            String[] tokens = command.split(" ");//command = "0 right 1"  -> split(" ") -> ["0", "right", "1"]
            // intiger,който да казва от кой индекс се маха калинка
            int index = Integer.parseInt(tokens[0]);// "0" -> 0
            //следтова ни трябва посоката
            String direction = tokens[1];//right -> посока на движение
            //дължината на летене
            int flyLendth = Integer.parseInt(tokens[2]);// "1" -> 1

            //има летене ако: индексът е в масива и на индексът има клинка
            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                //калинката излетява искаме с/у този индекс да стой 0
                if (direction.equals("right")) {
                    index += flyLendth;// нова позиция
                    //ПРОВЕРКА ДАЛИ КАЦА ИЛИ ОЩЕ ЛЕТИ
                    //дали новата позиция е свободна ли е в полето
                    //ако има вече калинка на полето - тя продалжава да лети и има калинка на новата позиция
                    //спира да лети: когато излезе извън полето или ако няма калинка на новата й позиция
                    while (index <= field.length - 1 && field[index] == 1) {
                        index += flyLendth;//каца
                    }
                    //ако не е излетяла
                    if (index <= field.length - 1) {
                        field[index] = 1;

                    }
                } else if (direction.equals("left")) {
                    index -= flyLendth;
                    //спра да лети: index < 0 или на него няма калинка
                    //продължава да лети: индекс >=0 && на индекс да има калинка

                    while (index >= 0 && field[index] == 1) {
                        index -= flyLendth;

                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (int number : field) {
            System.out.print(number + " ");
        }

    }
}

