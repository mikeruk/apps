package tema12FunctionalProgrammingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.Function;

public class P03drVariant {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = bufferedReader.readLine().split("\\s+");

        Function<String[], Integer> findSmallest = array -> {
            int num = Arrays.stream(array).mapToInt(Integer::parseInt).min().orElse(0);
            return num;
        };

        System.out.println(findSmallest.apply(inputLine));


    }
}
