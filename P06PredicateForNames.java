package tema12FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06PredicateForNames {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> checkLength = s -> s.length() <= n;

        String[] filtered = new String[names.length];
        Arrays.stream(names).filter(checkLength).forEach(s -> System.out.println(s));

    }
}
