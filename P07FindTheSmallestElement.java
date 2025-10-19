package tema12FunctionalProgrammingExercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> minNum = list -> {
            int min = Collections.min(list);
            int last = list.lastIndexOf(min);
            return  last;
        };

        System.out.println(minNum.apply(numbers));
    }
}
