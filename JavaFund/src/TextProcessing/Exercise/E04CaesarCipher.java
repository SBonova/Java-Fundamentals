package TextProcessing.Exercise;

import java.util.Scanner;

public class E04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитаме си входа - Programming is cool!
        String text = scanner.nextLine();

      //  String encryptedText = "";
        StringBuilder builderEncryptedText = new StringBuilder();
        
        //Обхождаме всеки един символ
        for (char symbol : text.toCharArray()) {
            //Криптираме всеки един символ
           // encryptedText += symbol + 3;
            char encryptedSymbol = (char)(symbol + 3);
            builderEncryptedText.append(encryptedSymbol);
        }
        System.out.println(builderEncryptedText);
    }
}
