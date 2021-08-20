package bg.Exercise;

import java.util.Scanner;

public class E09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //обща сума = мечове + одежди + колани
        // 1. сума за мечове = бр. мечовете(ученици + 10%) + цената мечовете(вход)
        //2. сумата за одеждите = бр. одежди(бр.ученици) * цената за одеждите(вход)
        //3. сумата за коланите= бр.колани(ученици - бр.на безплатните колани * цената на колана)(вход)

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(studentsCount + 0.10 * studentsCount) * priceLight;
        double sumRobe = studentsCount * priceRobe;
        double sumBelts = (studentsCount - studentsCount / 6) * priceBelt;

        double totalSum = sumLight + sumRobe + sumBelts;

        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else {
            double needMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }

    }
}
