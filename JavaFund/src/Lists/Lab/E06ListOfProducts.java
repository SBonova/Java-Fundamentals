package Lists.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        //обхождаме данните подадени ни от входа
        for (int i = 0; i < n; i++) {
            //добавяме входните дани към листа от продукти
            products.add(scanner.nextLine());
        }

        // all the products ordered by name.
        Collections.sort(products);

        //обхождаме листа по цялата му дължина т.е всеки един продукт
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i+1, products.get(i));
        }
    }
}
