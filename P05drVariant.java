package tema12FunctionalProgrammingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P05drVariant {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(bufferedReader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(bufferedReader.readLine());

        Collections.reverse(numbers);

        Predicate<Integer> isDivisable = m -> m % n != 0;
        List<String> s = numbers.stream().filter(isDivisable).map(e -> String.valueOf(e)).collect(Collectors.toList());
        System.out.println(String.join(" ", s));
    }
}
