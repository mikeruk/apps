package tema12FunctionalProgrammingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P06drVariant {

    public static void main(String[] args) throws IOException {

        //Write a predicate. Its goal is to check a name for its length and to return true if the names length is less or equal the
        //passed integer.
        // You will be given an integer that represents the length you have to use.
        // On the second line you will
        //be given a string array with some names. Print the names, passing the condition in the predicate.


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        List<String> names = Arrays.stream(bufferedReader.readLine().split("\\s+")).map(String::valueOf).collect(Collectors.toList());

        Predicate<String> checkLength = string -> string.length() <= n;

        names.stream().filter(checkLength).forEach(name -> System.out.println(name));






    }
}
