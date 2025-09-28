package tema12FunctionalProgrammingExercises;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04AppliedArithmetics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Function<int[], int[]> add = array -> Arrays.stream(array).map(number -> number += 1).toArray();

        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(number -> number *= 2).toArray();

        Function<int[], int[]> substract = array -> Arrays.stream(array).map(number -> number -= 1).toArray();

        Consumer<int[]> print = array -> Arrays.stream(array).forEach(e -> System.out.printf("%d ", e));

        String command = scanner.nextLine();

        Arrays.stream(add.apply(numbers)).forEach(e -> System.out.println(e));

        while(!command.equals("end")){

            switch (command){
                case "add":
                    numbers = add.apply(numbers);
                    break;

                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;

                case "subtract":
                    numbers = substract.apply(numbers);
                    break;

                case "print":
                   print.accept(numbers);
                    System.out.println();
                    break;

                default:
                    break;
            }

            command = scanner.nextLine();
        }

        Consumer<int[]> printNum = array -> Arrays.stream(array).forEach(e -> System.out.printf("%d ", e));
        printNum.accept(numbers);

    }
}
