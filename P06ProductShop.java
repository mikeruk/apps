package tema07SetsAndMapsAdvancedLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06ProductShop {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String,Double>> shops = new TreeMap<>();


        while(!input.equals("Revision")){

            String[] tokens = input.split(",\\s+");

            if(!shops.containsKey(tokens[0])){
                shops.put(tokens[0], new LinkedHashMap<>());
                shops.get(tokens[0]).put(tokens[1], Double.valueOf(tokens[2]));
            } else{
                shops.get(tokens[0]).put(tokens[1], Double.valueOf(tokens[2]));
            }

            input = scanner.nextLine();
        }

        for(Map.Entry<String, Map<String,Double>> shop: shops.entrySet()){
            System.out.println(shop.getKey()+"->");
            shop.getValue().entrySet().stream().forEach(e -> {
                System.out.printf("Product: %s, Price: %.1f%n", e.getKey(), e.getValue());
            });
        }





    }
}
