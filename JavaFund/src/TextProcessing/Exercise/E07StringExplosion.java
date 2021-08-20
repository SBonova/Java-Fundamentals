package TextProcessing.Exercise;

import java.util.Scanner;

public class E07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] text = input.split(">");

        int strength = 0;
        int strengthLeft = 0;

        for (int i = 0; i < text.length; i++) {
            if (Character.isDigit(text[i].charAt(0))){
                strength = Character.getNumericValue(text[i].charAt(0)) + strengthLeft;

                if (text[i].length() >= strength){
                    text[i] = text[i].substring(strength);
                }else {
                    strengthLeft = strength - text[i].length();
                    text[i] = "";
                }
            }

            if (i == text.length -1){
                System.out.print(text[i]);
            }else {
                System.out.print(text[i] + ">");
            }
        }
    }
}
