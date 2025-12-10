package tema07SetsAndMapsAdvancedLab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SoftUniParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> invited = new HashSet<>();

        while (!input.equals("PARTY")){

            if(!invited.contains(input)){
                invited.add(input);
            }
            input = scanner.nextLine();

        }
        input = scanner.nextLine();

        while (!input.equals("END")){
            invited.remove(input);
            input = scanner.nextLine();
        }

        System.out.println(invited.size());

        invited.stream().sorted().forEach(e -> System.out.println(e));




    }
}
