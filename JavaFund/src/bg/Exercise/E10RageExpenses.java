package bg.Exercise;

import java.util.Scanner;

public class E10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //общи разходи = сумата за слушалки + клавиатура + монитор
        //обща сума за мишки=бр. мишки * цената за 1бр. мишка
        //обща сума за клавиатура
        // обща сума за монитори
        // обща сума за слушалки


        int gameLose = Integer.parseInt(scanner.nextLine());
        //br.слушалките = загубени игри / 2;
        int countHeadset = gameLose / 2;

        //бр. мишките = загубените игри / 3;
        int countMice = gameLose / 3;

        //бр. клавиатура = загубении игри / 6;
        int countKeyboard = gameLose / 6;

        //бр.дисплейте = загубени игри / 12;
        int countDisplay = gameLose / 12;

        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = (countHeadset * headsetPrice) +(countMice * mousePrice)
                + (countKeyboard * keyboardPrice + (countDisplay * displayPrice));

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
