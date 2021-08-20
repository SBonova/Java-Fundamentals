package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String type = scanner.nextLine();

//        while (!type.equals("END")) {
//            Scanner input = new Scanner(type);
//
//            if (input.hasNextBoolean()) {
//                System.out.printf("%s is boolean type%n", type);
//            } else if (input.hasNextInt()) {
//                System.out.printf("%s is integer type%n", type);
//            } else if (type.length() == 1) {
//                System.out.printf("%s is character type%n", type);
//            } else if (input.hasNextDouble()) {
//                System.out.printf("%s is floating point type%n", type);
//            } else if (input.hasNextLine()) {
//                System.out.printf("%s is string type%n", type);
//            }
//            type = scanner.nextLine();
//        }

        //Гледаме ASCII table и търсим стойностите от колона Dec за да получим колона char
//    •Integer
//    •Floating point
//    •Characters -> с дължина от 1 и код < 48 || код || код > 57 до 64
//    •Boolean -> true / false
//    •Strings -> ако имаме последователност само от симболи (код < 45 || kod > 57)

       String input = scanner.nextLine();

        while (!input.equals("END")) {
            String type = "";
            //проверка за типове
            //boolean
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")){
                type = "boolean";
            }else if (input.length() == 1){ //char
                char symbol = input.charAt(0);//simbol
                //едноцифрено число
                if (symbol < 47 || symbol > 58){
                    type = "character";
                }else {
                    type = "integer";
                }
            }else {
                boolean isString = false;
                boolean isFloat = false;

                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);
                    //проверка дали е симбол
                    if (currentSymbol < 45 || currentSymbol > 57){
                        isString = true;
                    }
                    if (currentSymbol == 46) {
                        isFloat = true;
                    }
                }
                if (isString){
                    type = "string";
                }else {
                    //число
                    if (isFloat) {
                        type = "floating point";
                    } else {
                        type = "integer";
                    }
                }
            }
            System.out.printf("%s is %s type",input, type);
            input = scanner.nextLine();
        }
    }
}
