package tema07SetsAndMapsAdvancedLab;

import java.util.*;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Set<Integer> deck1 = new LinkedHashSet<>();
        Set<Integer> deck2 = new LinkedHashSet<>();

        for (int i = 0; i <= input.length -1; i++){
            deck1.add(Integer.valueOf(input[i]));
        }

        input = scanner.nextLine().split("\\s+");
        for (int i = 0; i <= input.length -1; i++){
            deck2.add(Integer.valueOf(input[i]));
        }



//        System.out.println(deck1);
//        System.out.println(deck2);

        for (int i = 0; i <= 49; i++){
            int num1 = deck1.iterator().next();
            int num2 = deck2.iterator().next();

            if(deck1.isEmpty() || deck2.isEmpty()){
                break;
            }
            if(num1 > num2){
                deck1.remove(num1);
                deck1.add(num1);
                deck1.add(num2);
                deck2.remove(num2);
            } else {
                deck2.remove(num2);
                deck2.add(num2);
                deck2.add(num1);
                deck1.remove(num1);
            }
        }

        if(deck1.isEmpty()){
            System.out.println("Second player win!");
        } else if(deck2.isEmpty()){
            System.out.println("First player win!");
        } else if(deck1.size() > deck2.size()){
            System.out.println("First player win!");
        } else if(deck1.size() < deck2.size()){
            System.out.println("Second player win!");
        } else if(deck1.size() == deck2.size()){
            System.out.println("Draw!");
        } else{
            System.out.println("Draw!");
        }
    }
}
