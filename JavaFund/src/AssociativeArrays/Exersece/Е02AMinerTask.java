package AssociativeArrays.Exersece;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Е02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer>resourcesQuantity = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        //ètem resurs dokato nepoluìm stop
        while (!resource.equals("stop")){
            //получам количество за всеки ресурс
            int quantity = Integer.parseInt(scanner.nextLine());
            //проверка имам ли такъв ресурс
            //ако нямам такъв ресурс
            if (!resourcesQuantity.containsKey(resource)){
                resourcesQuantity.put(resource, quantity);
            }else //ако имам такъв ресурс
            {
                //дай ми текущото количество и ми вземи от мапа resourcesQuantity
                // вземи стойноста срещу която стои този ключ
                int currentQuantity = resourcesQuantity.get(resource);
                //дай ми мапа resourcesQuantity и във мапа ми сложи нов запис срещу този resource
                //искам да ми стой currentQuantity -текущото количество + quantity- новото количство
                resourcesQuantity.put(resource, currentQuantity + quantity);
            }
            resource = scanner.nextLine();

                 resource = scanner.nextLine();
        }
     resourcesQuantity.entrySet().forEach(entry ->System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
