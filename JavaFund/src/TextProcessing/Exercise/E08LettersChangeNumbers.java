package TextProcessing.Exercise;

import java.util.Scanner;

public class E08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();//A12b s17G
//        String[] passwords = input.split("\\s+");//["A12b", "s17G"]
//
//        double totalSum = 0;//общата сума от всички пароли
//
//        //Обхождаме всяка една парола от масива с пароли
//        for (String password : passwords) {
//           //пресмятаме стойността
//            int modifiedNumber = getModifiedNumber(password);
//            //сумираме
//            totalSum += modifiedNumber;
//        }
//        System.out.printf("%.2f",totalSum);
//    }
//
//    private static int getModifiedNumber(String password) {
////{буква}{число}{буква}->A12b
//        char firstLetter = password.charAt(0);//A
//        char secondLetter = password.charAt(password.length() - 1);//b
//        //Първи начин
//       // int number = Integer.parseInt(password.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());//
//        //Втори начин
//        StringBuilder builder = new StringBuilder(password);
//       double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(password.length() - 1).toString());
//        //трети начин
//        //int num = Integer.parseInt(password.substring(1,password.indexOf(secondLetter)));
//        //Проверка дали първата буква е главна
//        if (Character.isUpperCase(firstLetter)){//проверка чрез аски кода >= 65 i <=90
//            //Позиция в азбуката
//            int positionUpperLetter = (int)firstLetter - 64;
//            number = number / positionUpperLetter;
//        }else{
//            int positionLowerLetter = (int)firstLetter - 96;
//            number = number * positionLowerLetter;
//        }
//
//        //проверка за втората буква
//        if(Character.isUpperCase(secondLetter)) {
//            int positionUpperLetter = (int)secondLetter - 64;
//            number = number - positionUpperLetter;
//        } else {
//            int positionLowerLetter = (int)secondLetter - 96;
//            number = number + positionLowerLetter;
//        }
//
//        return (int) number;


        String input = scanner.nextLine(); //"P34562Z q2576f   H456z"
        String [] passwords = input.split("\\s+"); //["P34562Z", "q2576f", "H456z"]
        double totalSum = 0; //обща сума от всички пароли
        for (String password : passwords) {
            //пресмятаме стойността
            double modifiedNumber = getModifiedNumber(password);
            //сумираме
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f", totalSum);

    }

    private static double getModifiedNumber (String password) {
        //{буква}{число}{буква} -> "P34562Z"
        char firstLetter = password.charAt(0); //"P"
        char secondLetter = password.charAt(password.length() - 1);
        //първи начин: int number = Integer.parseInt(password.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());
        //втори начин:
        StringBuilder builder = new StringBuilder(password);
        double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());
        //трети начин: int number = Integer.parseInt(password.substring(1, password.indexOf(secondLetter)));

        //проверка за първата буква
        if (Character.isUpperCase(firstLetter)) { //аски кода >= 65 и <= 90
            //позиция в азбуката
            int positionUpperLetter = (int)firstLetter - 64;
            number = number / positionUpperLetter;
        } else {
            int positionLowerLetter = (int)firstLetter - 96;
            number = number * positionLowerLetter;
        }

        //проверка за втората буква
        if(Character.isUpperCase(secondLetter)) {
            int positionUpperLetter = (int)secondLetter - 64;
            number = number - positionUpperLetter;
        } else {
            int positionLowerLetter = (int)secondLetter - 96;
            number = number + positionLowerLetter;
        }

        return number;
    }
}
