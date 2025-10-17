package tema12FunctionalProgrammingExercises;

import java.io.*;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class P01drVariant {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bufferedReader.readLine();

        Consumer<String> printInputLine = s -> {
            String[] split = inputLine.split("\\s+");
            Arrays.stream(split).forEach(e -> System.out.println(e));
        };

        printInputLine.accept(inputLine);
    }

}
