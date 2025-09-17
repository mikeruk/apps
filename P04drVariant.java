package tema12FunctionalProgrammingExercises;

import java.nio.file.LinkPermission;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class P04drVariant {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        UnaryOperator<int[]> add = array -> Arrays.stream(array).map(num -> num += 1).toArray();

        UnaryOperator<int[]> multiply = array -> Arrays.stream(array).map(num -> num *= 2).toArray();

        UnaryOperator<int[]> substract = array -> Arrays.stream(array).map(num -> num -= 1).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){

            switch (input){
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
                    Arrays.stream(numbers).forEach(e -> System.out.print(e +" "));
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();

        }

    }
}
