package tema11FunctionalProgramming;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        List<Integer> firstOutput = numbers.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
        String output = firstOutput.stream().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(output);


        Function<Integer, Integer> func = x -> x * x;

        List<Integer> numbers2 = firstOutput.stream().filter(n -> n % 2 ==0).sorted((e1, e2) -> Integer.compare(e1, e2)).collect(Collectors.toList());
        String output2 = numbers2.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(output2);

    }







}
