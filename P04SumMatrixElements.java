package tema05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04SumMatrixElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        System.out.println(dimensions[0]);
        System.out.println(dimensions[1]);
        int m = 0;
        for(int i = 0; i <= dimensions[0] - 1; i++){

            m +=  Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).sum();


        }
        System.out.println(m);

    }
}
