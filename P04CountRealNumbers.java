package tema07SetsAndMapsAdvancedLab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> realNumbers = new LinkedHashMap<>();

        for(double num: numbers){
            if(!realNumbers.containsKey(num)){
                realNumbers.put(num, 1);

            } else{
                realNumbers.put(num, realNumbers.get(num)+1);
            }

        }

        for(Map.Entry<Double, Integer> num: realNumbers.entrySet()){
            System.out.println(String.format("%.1f -> %d", num.getKey(), num.getValue()));
        }

    }
}
