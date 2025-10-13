package tema12FunctionalProgrammingExercises;

import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03CustomMinFunction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        Function<int[], Integer> printSmallest = n -> Arrays.stream(n).min().orElse(0);
        System.out.println(printSmallest.apply(numbers));



    }
}
