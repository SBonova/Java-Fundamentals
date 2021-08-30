package FinalExamTask.PFFE_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //?- да се реща 0 или един път
        String productRegex = "@#+(?<product>[A-Z][a-zA-Z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(productRegex);

        for (int i = 0; i < n; i++) {
         String barcode = scanner.nextLine();
         //валиден баркод
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()){
                //FreshFisH
                //Brea0D
                //Che4s6E
               String product = matcher.group("product");
               String productGroup = "";

                for (int index = 0; index < product.length() - 1 ; index++) {
                    char currentSymbol = product.charAt(index);
                    if (Character.isDigit(currentSymbol)){
                        productGroup += currentSymbol;
                    }
                 }
                   // ако нямаме цифри
                if (productGroup.equals("")){
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: " + productGroup);
                }
            }else{
                //невалиден баркод
                System.out.println("Invalid barcode");
            }
        }
    }
}
//Map - речници