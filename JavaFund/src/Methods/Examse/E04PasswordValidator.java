package Methods.Examse;

import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        //1. проверка за дължината -> 6 до 10 вкл.символа
        //ако дължината не е валидна - print
        boolean isValidLength = isValidLength(pass);
        if (isValidLength == false){
            System.out.println("Password must be between 6 and 10 characters");
        }

        //2. проверка дали съдържа само букви и цифри
        boolean isValidContent = isValidContent(pass);
        if (isValidContent == false){
            System.out.println("Password must consist only of letters and digits");
        }
        //3. проверка дали има поне 2 цифри
        boolean isValidCount = isValidCountDigits(pass);
        if (isValidCount == false){
            System.out.println("Password must have at least 2 digits");
        }

        //ако паролата е валидна по всички параметри
        if (isValidLength && isValidContent && isValidCount){
            System.out.println("Password is valid");
        }
    }

    //метод за проверка на дължината -> true(валидна дължина) и false za newalidna
    private static boolean isValidLength(String pass) {
        //дали е валидна
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else // невалиидна
            return false;
    }

    //метод за проверка на букви и цифри - true/false
    private static boolean isValidContent(String pass){
        for (int index = 0; index < pass.length(); index++) {
            char curr = pass.charAt(index);
     //ако симбола ми е различен от буква или цифра
            if (!Character.isLetterOrDigit(curr)) {
                return false;
            }
        }
        //обходили сме всички символи и никой не ми е бил различен от буква или цифра
        return true;
    }

    //метод за проверка на броя на цифрите в паролата -> true/false
    private static boolean isValidCountDigits(String pass){
        //true- броя на цифрите >= 2
        //броя на цифрите <= 2
        int count = 0;
        for (int index = 0; index < pass.length(); index++) {
            char currSymbol = pass.charAt(index);
            //proverka за цифра
            if (Character.isDigit(currSymbol)){
                count++;
            }
        }
        //броя на цифрите
        return  count >= 2;
    }
}
