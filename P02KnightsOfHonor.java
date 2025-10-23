package tema12FunctionalProgrammingExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class P02KnightsOfHonor {

    public static void main(String[] args) {


        Scanner scanner  = new Scanner(System.in);

        List<String> input =Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Consumer<String> printNames = name -> System.out.println("Sir "+ name);

        input.stream().forEach(e -> printNames.accept(e));

    }

}
