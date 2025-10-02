package tema12FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05ReverseAndExclude {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());




        Collections.reverse(numbers);








        Predicate<Integer> isDivisable = m -> m % n != 0;

        List<String> s = numbers.stream().filter(isDivisable).map(e -> String.valueOf(e)).collect(Collectors.toList());
        System.out.println(String.join(" ", s));

    }
}
