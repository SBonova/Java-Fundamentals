package AssociativeArrays.Exersece;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class E04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Double> orders = new LinkedHashMap<>();
        Map<String, Integer> products = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("buy")) {
            String []data = command.split("\\s+");
            String protuctName = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            //If the product doesn't exist yet, add it with its starting quantity.
            //If you receive a product, which already exists, increase its quantity
            // by the input quantity and if its price is different, replace the price as well.
            if (!orders.containsKey(protuctName)){
               orders.put(protuctName, quantity * price);
               products.put(protuctName, quantity);
            }else {
                products.put(protuctName, products.get(protuctName) + quantity);
                orders.put(protuctName,products.get(protuctName) * price);
            }
            command = scanner.nextLine();
        }
        orders.forEach((key, value) ->
                System.out.println(String.format("%s -> %.2f", key, value)));
    }
}
