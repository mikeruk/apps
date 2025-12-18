package tema07SetsAndMapsAdvancedLab;

import java.util.*;

public class P07CitiesByContinentAndCountryDrVar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> countriesAndContinents = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];
            countriesAndContinents.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> cityMap = countriesAndContinents.get(continent);
            cityMap.putIfAbsent(country, new ArrayList<>());
            List<String> cities = cityMap.get(country);
            cities.add(city);
        }
        countriesAndContinents.forEach((continent, countries) -> {
            System.out.println(continent + ":");
            countries.forEach((country, city) -> System.out.println("  " + country + " -> " + String.join(", ", city)));
        });
    }
}
