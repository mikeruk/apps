package tema12FunctionalProgrammingExercises;

import javax.management.openmbean.CompositeDataSupport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P02drVariant {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = bufferedReader.readLine().split("\\s+");

        Consumer<String[]> appendSir = array -> {
            for(String word: array){
                System.out.println("Sir "+ word);
            }

        };
        appendSir.accept(inputLine);



    }
}
