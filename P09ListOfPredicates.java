package tema12FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P09ListOfPredicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        BiFunction<List<Integer>, Integer, Boolean> isDivisible = (list, number) -> {
            for (int numberInList: list){
                if(number % numberInList != 0){
                    return false;
                }
            }
            return true;
        };

        for(int i = 1; i <= n; i++){
            if(isDivisible.apply(numbers, i)){
                System.out.print(i + " ");
            }
        }




    }
}
