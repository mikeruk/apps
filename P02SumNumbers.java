package tema11FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P02SumNumbers {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Function<String, Integer> countIntegerInString = str -> str.split(", ").length;

        Function<String, Integer> sumIntegerInString = str ->
                Arrays.stream(str.split(", "))
                        .mapToInt(Integer::parseInt)
                        .sum();

        System.out.println("Count = " + countIntegerInString.apply(input));
        System.out.println("Sum = " + sumIntegerInString.apply(input));

    }
}
